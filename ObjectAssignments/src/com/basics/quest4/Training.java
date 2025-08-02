package com.basics.quest4;

public class Training {
	String[] showCourses() {
		// to print and array of course names
		return new String[] { "Java", "Angular", "MySQL", "Micro Service", "Spring Boot" };
	}

	void showTrainers(String... names) {
		// Iterate through the array and
		System.out.println("Trainer names: ");
		for (String name : names) {
			System.out.println(" :" + name);
		}

	}

}
