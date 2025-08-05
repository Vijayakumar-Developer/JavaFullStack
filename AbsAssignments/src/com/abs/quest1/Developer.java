package com.abs.quest1;

public class Developer extends TeamLead {
String[] hobbies;

	public Developer(String empName, double salary, int empId, String[] hobbies) {
	super(empName, salary, empId);
	this.hobbies = hobbies;
}

	@Override
	String[] showCourses() {
//		return super.showCourses();
		return new String[] {"Kafka,DOcker","AWS"};
	}

	@Override
	void showProjects() {
System.out.println("Working On Project in AMD and Deepfinder AI");		
	}

	void showHobbies(){ 
//	    syso(Hobby+”is hobby”);
		for(String Hobby : hobbies) {
		System.out.println(Hobby+ "is hobby");

	}
	}
}
	
	


