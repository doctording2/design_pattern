package com.bjpowernode.pattern;  
  
public class UserManagerImpl implements UserManager {  
  
    public String test(String userId) {  
        System.out.println("UserManagerImpl.findUser() userId-->>" + userId);  
        return "张三";  
    }  
  
}  