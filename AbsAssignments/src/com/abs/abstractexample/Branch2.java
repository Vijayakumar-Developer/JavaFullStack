package com.abs.abstractexample;

public abstract class Branch2 extends Bank {

	@Override
	void housingLoan() {
System.out.println("Hosuing Loan in Branch 2");		
	}

	@Override
	void eduLoan() {
		System.out.println("Education Loan in Branch 2");		
	}
	void loanTypes() {
		System.out.println("FOr agriculture, businees,shops");
	}

}
