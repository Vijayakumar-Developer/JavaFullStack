package com.inher.quest5;

public class SmartPhone extends Mobile {

	@Override
	void call() {
//		super.call();
		System.out.println("Smart Phone Details : ");
	}

	String[] apps() {
		return new String[] { "VIvo", "Nokia", "I Phone" };
	}

}
