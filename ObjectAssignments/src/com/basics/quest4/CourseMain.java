package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {
//		Get input to get the trainers name (to populate the array) 
//		and call showTrainers(“Rohan”,”Sathya”) method 
//		∙Call showCourses() method. This returns an array. Iterate and print 
//		the course names

		Scanner sc = new Scanner(System.in);
		Training training = new Training();

		System.out.println("Enter Trainers:");
		int n = sc.nextInt();

		String[] trainerNames = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter trainer " + (i + 1) + " name: ");
			trainerNames[i] = sc.nextLine();
		}

		training.showTrainers(trainerNames);

		System.out.println("Available Courses:");
		String[] courses = training.showCourses();
		for (String course : courses) {
			System.out.println(": " + course);
		}

		sc.close();
	}
}