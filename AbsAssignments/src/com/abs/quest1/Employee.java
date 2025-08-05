package com.abs.quest1;

public abstract class Employee {
	String empName;
	double salary;
	int empId;
	final String COMPANYNAME = "";

	public Employee(String empName, double salary, int empId) {
//		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}

	void printDetails() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Comapany Name: " + COMPANYNAME);
	}

	abstract void calcBonus(double amount);

	String[] showCourses() {
		return new String[] { "SPring", "Java", "Angular", "React" };
		// return an array of courses;

	}

	abstract void showProjects();

	final void showRules() {
		officeHours(); // call the private method
		System.out.println("Leave policies:24 days leave per year");
		System.out.println("OD policies: OD approved from Manager approval");
//	       print("leave policies"); 
//	        print("od policies"); 
	}

	private void officeHours() {
		System.out.println("office Hour: 14 hours Per Day ! ");
	}
}
