package com.basics.quest2;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdraw amount is positive");
		} else if (amount > balance) {
			System.out.println("Insufficient balance:");
		} else {
			balance -= amount;
			System.out.println("withdrawn successfully." + amount);
		}
	}

	void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount is positive.");
		} else {
			balance += amount;
			System.out.println(" deposited successfully" + amount);
		}
	}

	double getBalance() {
		return balance;
	}
}
