package com.over.quest1;

public class Employee {
	// ∙Has name, designation as instance variable
	String name;
	String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	void calcBonus(double basicAllowance) {// add simple print stmts
		System.out.println(name + designation + " gets basic: " + basicAllowance);

	}

	void calcBonus(double basicAllowance, String gift) {// add simple print
		// stmts
		System.out.println(name + designation + " gets basic: " + basicAllowance + " and a gift: " + gift);

	}

	void calcBonus(double basicAllowance, String gift, double houseAllowance) {// add simple print stmts
		System.out.println(name + designation + "gets basic: " + basicAllowance + ", gift: " + gift
				+ ", and house allowance: " + houseAllowance);

	}
}
