package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
//		Get user input for employee name and designation as Manager, 
		Scanner sc = new Scanner(System.in);
//		programmer, Director. 
//		Create 5 employee objects. Add the objects to an employee array 
		Employee[] employees = new Employee[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println("Enter  Designation (Manager /Programmer /Director) :");
			String designation = sc.nextLine();
			employees[i] = new Employee(name, designation);
		}

		for (Employee emp : employees) {
			switch (emp.designation.toLowerCase()) {

			case "programmer":
				emp.calcBonus(50000.0);
				break;
			case "manager":
				emp.calcBonus(80000, "Watch");
				break;
			case "director":
				emp.calcBonus(100000, "Car", 20000);
				break;
			default:
				System.out.println("Invalid designation for " + emp.name);

			}

		}
//		∙Based on the designation call the appropriate calcBonus method 
//		∙If the input for designation is Programmer call method with one 
//		argument(basicAllowance) 
//		∙If the input for designation is Manager, call method with 2 
//		arguments(basicAllowance,gift) 
//		∙If the input for designation is Director call method with 3 
//		argumemts(basicAllowance,gift,housingAllowance) 

	}
}