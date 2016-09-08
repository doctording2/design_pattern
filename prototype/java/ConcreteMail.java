package com.prototype;

public class ConcreteMail implements MailPrototype {  
	  
    private String receiver;  
    private String subject;  
    private String contxt;  
      
    public ConcreteMail(String subject,String contxt) {  
        this.subject = subject;  
        this.contxt = contxt;  
    }  
      
    public ConcreteMail clone() {  
        try {  
            return (ConcreteMail)super.clone();  
        }catch (CloneNotSupportedException e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
  
    public String getReceiver() {  
        return receiver;  
    }  
  
    public void setReceiver(String receiver) {  
        this.receiver = receiver;  
    }  
  
    public String getSubject() {  
        return subject;  
    }  
  
    public void setSubject(String subject) {  
        this.subject = subject;  
    }  
  
    public String getContxt() {  
        return contxt;  
    }  
  
    public void setContxt(String contxt) {  
        this.contxt = contxt;  
    }  
      
}  