package com.inher.quest2;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// super.withdraw(amount);
		if (amount <= balance) {
			balance -= amount;
			System.out.println("WIthdrawn in Savinngs account : " + amount);
		} else {
			System.out.println("Insufficent Balance");
		}
	}

	@Override
	void deposit(double amount) {
		// super.deposit(amount);
		balance += amount + 250; // bonus amount in savings account deposit
		System.out.println("Deposited amount in Savings Account: " + amount);
	}

}
