package com.basics.quest3;

public class Student {
	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Name : " + name);
		System.out.println("Department : " + department);

	}

	String getGrades(int[] marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		double avg = sum / (double) marks.length;

		String grade;
		if (avg >= 90 && avg <= 100) {
			grade = "A";
		} else if (avg >= 80 && avg < 90) {
			grade = "B";
		} else if (avg >= 70 && avg < 80) {
			grade = "C";
		} else if (avg >= 60 && avg < 70) {
			grade = "D";
		} else if (avg >= 50 && avg < 60) {
			grade = "E";
		} else {
			grade = "Fail";
		}
		// calculate sum, average and grade
//		grade as A(90-100) or B(80-90) or C(70-80) or D(60-70) or E(50-59) or fail 

		return grade + "(average: " + avg + ")";

	}

}
