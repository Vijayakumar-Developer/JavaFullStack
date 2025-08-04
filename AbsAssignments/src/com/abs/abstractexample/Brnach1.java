package com.abs.abstractexample;

public class Brnach1 extends Bank {

	@Override
	void carLoan() {
System.out.println("car loan is in Branch 1");
	}

	@Override
	void housingLoan() {
		System.out.println("hosuing loan is in Branch 1");
	}

	@Override
	void eduLoan() {
		System.out.println("edu loan is in Branch 1");
	}
	void payDetails() {
		System.out.println("Bonus payment for employees:");
	}

}
