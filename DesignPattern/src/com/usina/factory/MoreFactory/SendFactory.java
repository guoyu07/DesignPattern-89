package com.usina.factory.MoreFactory;

public class SendFactory {
	public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
