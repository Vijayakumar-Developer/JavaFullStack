package com.abs.quest1;

import java.util.Scanner;

public class DemoAbs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp;
		System.out.println("Enter role 1.Manager 2.team Leader 3.Developer");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			emp = new Manager("Vijayakumar", 50000, 1993, "Athletics");
			break;
		case 2:
			emp = new TeamLead("Ezhil", 80000, 2021) {
				@Override
				String[] showCourses() {
//				return super.showCourses();
					return new String[] { "Kotlin", "C", "C++" };
				}

				@Override
				void showProjects() {
					System.out.println("AI and Mobile App Developemmts");
				}
			};
			break;
		case 3:
			String[] hobbies = { "Cricket", "Cinema" };
			emp = new Developer("Maran", 70000, 2025, hobbies);

			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
		// sc.close();
		emp.printDetails();

	}

}
