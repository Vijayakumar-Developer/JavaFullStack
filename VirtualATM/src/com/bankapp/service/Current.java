package com.bankapp.service;

public class Current extends Account {
	
	public Current(double balance) {
		super(balance);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
        if(amount > balance + 5000) { 
            System.out.println("Withdrawal limit exceeded.Overdraft limit reached.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current . New Balance: " + balance);
        }

		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
        balance += amount;
        System.out.println("Deposited " + amount + ". New Balance: " + balance);
		
	}
	
	public void transcationsAllowed() {
        System.out.println("Current Account: 20 transactions allowed per day.");

	}
	

}
