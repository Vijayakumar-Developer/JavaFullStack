package com.basics.quest2;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(5000.0);

		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.print("Enter your choice (1-3): ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmount = sc.nextDouble();
			bank.withdraw(withdrawAmount);
			break;
		case 2:
			System.out.print("Enter amount to deposit: ");
			double depositAmount = sc.nextDouble();
			bank.deposit(depositAmount);
			break;
		case 3:
			System.out.println("Current Balance:" + bank.getBalance());
			break;
		default:
			System.out.println("Invalid choice.");
		}

		System.out.println("Final Balance:" + bank.getBalance());
		sc.close();
	}
}
