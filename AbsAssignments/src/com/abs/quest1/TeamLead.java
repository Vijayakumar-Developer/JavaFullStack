package com.abs.quest1;

public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("TeamLead Bonus: " + (salary * amount));

	}

	void corporateServices() {
		System.out.println("Team Lead handles corporate service ");

	}

}
