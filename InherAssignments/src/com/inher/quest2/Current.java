package com.inher.quest2;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if(amount <= balance +1000) {//overdraft amount 1000
			balance -= amount;
			System.out.println("Current acocount withdrwawn: " + amount);
			
		}
		else {
			System.out.println("Exceed the overdrsft limit");
			
		}
	}

	@Override
	void deposit(double amount) {
		balance += amount;
		System.out.println("Current accounted deposit amount:" +amount);
	}
	
	

}
