package com.inher.quest4;

public class PhoneCommunication extends Communication {

	@Override
	void sendMessage() {
		// super.sendMessage();
		System.out.println("communication through phone/mobile verbally");
	}

	void callService() {
		// print(can be local,international orSubscriber trunk dialing STD )
		System.out.println("can be local,international orSubscriber trunk dialing STD");
	}

}
