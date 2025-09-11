package com.bankapp.client;

import java.util.Scanner;

import com.bankapp.service.Account;
import com.bankapp.service.Current;
import com.bankapp.service.Savings;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     Account account = null;

	     System.out.println(" Welcome to Virtual ATM ");
	     
	     while(true) {
	    	 
	            System.out.println("Choose Account Type:");
	            System.out.println("1. Savings Account");
	            System.out.println("2. Current Account");
	            System.out.print("Enter choice: ");
	            
	            int choice = sc.nextInt();
	            
	            switch(choice) {
	            case 1:
	            	account = new Savings(5000);
	            	((Savings)account).showDepositSchemes();
	            	break;
                case 2:
                    account = new Current(10000); 
                    ((Current)account).transcationsAllowed();
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    continue;

	            }
	            
	            while (true) {
	                System.out.println("\n ATM Menu ");
	                System.out.println("1. Withdraw");
	                System.out.println("2. Deposit");
	                System.out.println("3. Check Balance");
	                System.out.println("4. Exit to Main Menu");
	                System.out.print("Enter your choice: ");
	                int option = sc.nextInt();

	                switch(option) {
	                    case 1:
	                        System.out.print("Enter amount to withdraw: ");
	                        double wAmt = sc.nextDouble();
	                        account.withdraw(wAmt);
	                        break;

	                    case 2:
	                        System.out.print("Enter amount to deposit: ");
	                        double dAmt = sc.nextDouble();
	                        account.deposit(dAmt);
	                        break;

	                    case 3:
	                        System.out.println("Current Balance: " + account.getBalance());
	                        break;

	                    case 4:
	                        System.out.println("Returning to Main Menu...");
	                        break;

	                    default:
	                        System.out.println("Invalid option.");
	                }

	                if(option == 4) break;
	            }

	            System.out.print("Do you want to continue using ATM? (yes/no): ");
	            String again = sc.next();
	            if(!again.equalsIgnoreCase("yes")) {
	                System.out.println(" Thank you for using Virtual ATM.");
	                System.exit(0);
	            }
	        }
	    }
}
