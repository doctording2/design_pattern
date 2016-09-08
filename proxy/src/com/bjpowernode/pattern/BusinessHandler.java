package com.bjpowernode.pattern;  
  
import java.lang.reflect.InvocationHandler;  
import java.lang.reflect.Method;  
import java.lang.reflect.Proxy;  

/*
 * 代理处理器类
 * invoke方法内部实现预处理，对委托类方法调用，事后处理等逻辑
 */
public class BusinessHandler implements InvocationHandler {  
      
    private Object targetObject;  
      
    public Object newProxyInstance(Object targetObject) {  
          
        this.targetObject = targetObject;  
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),  
                               targetObject.getClass().getInterfaces(), this);  
    }  
      
    public Object invoke(Object proxy, Method method, Object[] args)  
            throws Throwable {  
        System.out.println("Log start-->>" + method.getName());  
        for (int i=0; i<args.length; i++) {  
            System.out.println(args[i]);  
        }  
        Object ret = null;  
        try {  
            //调用目标方法  
            ret = method.invoke(targetObject, args);  
            System.out.println("log success-->>" + method.getName());   
        }catch(Exception e) {  
            e.printStackTrace();  
            System.out.println("log error-->>" + method.getName());  
            throw e;  
        }  
        return ret;  
    }  
  
}  