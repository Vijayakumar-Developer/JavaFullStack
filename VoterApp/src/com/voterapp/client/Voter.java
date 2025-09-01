package com.voterapp.client;

import com.voterapp.service.*;
import com.voterapp.exception.*;
import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IElectionBoothService service = new ElectionBoothServiceImpl();

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Locality: ");
            String locality = sc.nextLine();

            System.out.print("Enter Voter ID: ");
            int voterId = sc.nextInt();

            if (service.checkEligibility(age, locality, voterId)) {
                System.out.println("You are eligible to vote!");
            }
        } 
        catch (UnderAgeException e) {
            System.out.println(" " + e.getMessage());
        } 
        catch (LocalityNotFoundException e) {
            System.out.println(" " + e.getMessage());
        } 
        catch (InvalidVoterIDException e) {
            System.out.println(" " + e.getMessage());
        } 
        catch (NotEligibleException e) {
            System.out.println("General Error: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
