package com.abs.quest1;

public class Manager extends Employee {

	String activity; // own property

	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	// should have a parameterised constructor
	// override all three methods
	// own method of Manager
	void funClub() {
		System.out.println("Activity " + activity);
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Manager Bonus: " + (salary * amount));
	}

	@Override
	String[] showCourses() {
		// return super.showCourses();
		return new String[] { "Dot net", "PHp", "Python" };
	}

	@Override
	void showProjects() {
		System.out.println("ERP,HRIS,INventory management");
	}

}
