package com.bjpowernode.pattern;  
  
public class ProManagerImpl implements ProManager {  
  
    public String test(String userId) {  
        System.out.println("UserManagerImpl.findUser() userId-->>" + userId);  
        return "张三";  
    }

	
	public String getName(String proId) {
		  System.out.println("ProManagerImpl.getName() proId-->>" + proId);  
	      return "电脑";  
	}  
  
}  