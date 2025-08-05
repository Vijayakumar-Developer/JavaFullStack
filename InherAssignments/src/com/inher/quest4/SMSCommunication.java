package com.inher.quest4;

public class SMSCommunication extends Communication {

	@Override
	void sendMessage() {
		// super.sendMessage();
		System.out.println("communication through short messaging service");
	}

	void messageLength() {
//		print (short messages of up to 160 characters  )
		System.out.println("Short message of up to 160 CHaracters");
	}

}
