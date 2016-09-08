package com.prototype;

public class Client {  
	  
    private static int MAX_COUNT = 5;  
      
    public static void main(String[] args) {  
        ConcreteMail mail = new ConcreteMail("Meeting Notice", "There is meeting at 301 5:00pm");  
        for(int i=0;i<MAX_COUNT;i++) {  
            mail.clone();  
            mail.setReceiver("Dear madam/sir: member " + i);  
            send(mail);  
            System.out.println("-----------------------------------");  
        }  
    }  
      
    public static void send(ConcreteMail mail) {  
        System.out.println("Receiver : " + mail.getReceiver());  
        System.out.println("Subject : " +  mail.getSubject());  
        System.out.println("\t" + mail.getContxt());  
    }  
      
}  

