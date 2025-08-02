package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger message = new Messenger();
		message.sendMail("HI ");
		message.sendMail("vijai1993@gmail.com", " Project Update");
		message.sendMail("vijai@gmail.com", "Project Update status", "Status Reminder");
//		Create an object of Messenger class    
//		∙Call the methods by passing the appropriate values 
	}

}
