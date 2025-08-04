package com.abs.abstractexample;

public abstract class  Bank {
	abstract void carLoan();
	abstract void housingLoan();
	abstract void eduLoan();
	final void adminDetails() {
		System.out.println("Rules for Bank Employees:");
	}

}
