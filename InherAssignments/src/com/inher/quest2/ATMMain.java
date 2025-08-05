package com.inher.quest2;

import java.util.Scanner;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;
		System.out.println("Choose Account Type: 1.Savings 2.Current");
		int type = sc.nextInt();
		System.out.print("Enter initial balance: ");
		double bal = sc.nextDouble();

		if (type == 1) {
			account = new Savings(bal);
		} else {
			account = new Current(bal);
		}

		int choice;
		System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
		choice = sc.nextInt();

		switch (choice) {

		case 1:

			System.out.println("Enter Depost amount: ");
			account.deposit(sc.nextDouble());
			break;
		case 2:

			System.out.println("Enter Withdraw amount: ");
			account.withdraw(sc.nextDouble());
			break;
		case 3:

			System.out.println("Current Balance: " + account.getBalance());

			break;
		case 4:

			System.out.println("Thanks For using ATM ");
			break;

		default:
			System.out.println("Invalid Option");

		}
		sc.close();

	}
}
