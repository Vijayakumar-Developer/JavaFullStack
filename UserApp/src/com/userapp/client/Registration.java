package com.userapp.client;

import java.util.Scanner;

import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;
import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooShortException;
import com.userapp.exception.TooLongException;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IValidationService service = new ValidationServiceImpl();

        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

       
            if (service.validateUsername(username)) {
                System.out.print("Enter password: ");
                String password = sc.nextLine();

       
                if (service.validatePassword(password)) {
                    System.out.println("Welcome " + username + ". You are registered!");
                }
            }
        } catch (NameExistsException e) {
            System.out.println("Registration failed: " + e.getMessage());
        } catch (TooShortException | TooLongException e) {
            System.out.println("Password error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
