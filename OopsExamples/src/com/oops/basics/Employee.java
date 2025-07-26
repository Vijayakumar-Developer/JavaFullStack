package com.oops.basics;

public class Employee {
	String employeeName;
	int employeeID;
	double salary;
	

	public static void main(String[] args) {
Employee employee1 = new Employee();
employee1.employeeName ="Vijay";
employee1.employeeID =20338737;
employee1.salary =2000000.00;
System.out.println("Name " +employee1.employeeName);
System.out.println("Emp Id " +employee1.employeeID);
System.out.println("Salary " +employee1.salary);

Employee employee2 = new Employee();
employee2.employeeName ="Kumar";
employee2.employeeID =20338738;
employee2.salary =3000000.00;
System.out.println("Name " +employee2.employeeName);
System.out.println("Emp Id " +employee2.employeeID);
System.out.println("Salary " +employee2.salary);

//Employee employee3 = new Employee();




	}

}
