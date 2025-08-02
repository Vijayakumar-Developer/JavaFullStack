package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
//		Get User input to get student name, id and marks (to 
//				populate the array). 
//				∙Now create 2 student objects and populate with the values 
//				∙Call both the methods to print student details and grade
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter Details for Student" + i);
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Department: ");
			String department = sc.nextLine();
			
			System.out.println("Enter the 5 Marks ");
			
			int[] marks = new int[5];
			for (int j = 0; j < 5; j++) {
				marks[j] = sc.nextInt();
			}
			sc.nextLine();
			
			Student student = new Student(name, department);
			student.printDetails();
			System.out.println("Grade : " + student.getGrades(marks));

		}
	}

}
