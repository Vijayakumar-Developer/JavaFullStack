package com.inher.quest2;

public class Account {
	double balance;

	public Account(double balance) {
		// super();
		this.balance = balance;
	}

	void withdraw(double amount) {
		System.out.println("Withdraw Process : ");

	}

	void deposit(double amount) {
		System.out.println("Deposit Process : ");

	}

	double getBalance() {
		return balance;
	}

}
