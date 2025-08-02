package com.over.quest4;

public class Greeter {
	String name;
	// default const, parameterized const

	Greeter() {

	}

	public Greeter(String name) {
//		super();
		this.name = name;
	}

	void greetUser(String... messages) {
		// iterate through messages and print message + name;
		// here the message varies but name is same
		for (String message : messages) {
			System.out.println("Message :" + message);
		}
	}

	void sayHello(String... names) {
		for (String name : names) {
			System.out.println("Names: " + name);
		}
	}
	// iterate through names and print "Welcome"+name;
	// here the message is same but name varies

}
