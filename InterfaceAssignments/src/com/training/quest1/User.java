package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 's' for student or 'e' for employee ");
		char choice = sc.next().charAt(0);
		
		Institute institute;
        choice = Character.toUpperCase(choice);

		if(choice =='S') {
            institute = new StudentCourses();
            System.out.println("Student Courses:");
		}
		else if(choice =='E') {
			institute = new EmployeeCourses();
			System.out.println("Employee Courses:");
			
		}else {
            System.out.println("Invalid choice!");
            sc.close();
            return;

		}
		
		for(String course : institute.showCourses()) {
			System.out.println(":" + course);
		}
		sc.close();

	}

}
