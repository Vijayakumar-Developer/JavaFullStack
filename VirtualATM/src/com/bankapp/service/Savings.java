package com.bankapp.service;

public class Savings extends Account {
	
	public Savings(double balance) {
		super(balance);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount > balance) {
			System.out.println("Insufficient funds from savings Account");
		}else {
			balance -= amount;
			System.out.println("withdrawn from" +amount +"Savings" +". New Balance is " +balance);
		}
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount + (amount * 0.02);
		System.out.println("Deposited with 2 % bonus. New Balance is " + balance);
		
	}
	
public void showDepositSchemes() {
	System.out.println("Saving Deposit scheme:");
	System.out.println("- Fixed Deposit");
	System.out.println("-Recurring Deposit");
	System.out.println("-Tax Saver Deposit");
}

}
