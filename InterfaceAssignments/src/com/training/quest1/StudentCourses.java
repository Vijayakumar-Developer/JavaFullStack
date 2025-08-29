package com.training.quest1;

public class StudentCourses implements Institute {

	@Override
	public String[] showCourses() {
		// TODO Auto-generated method stub
//		return null;
		return new String[] { "Python", "Java", "Angular", "Spring" };
	}

}
