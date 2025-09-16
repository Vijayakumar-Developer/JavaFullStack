package com.training.quest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
	private String name;
	private int employeeid;
	private String city;
	
	public Employee(String name, int employeeid, String city) {
		super();
		this.name = name;
		this.employeeid = employeeid;
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "Employee" + name + "employeeid" + employeeid + "city" + city ; 
	}
	
	
}
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Employee> employees = Arrays.asList(
                new Employee("Vijay", 101, "Chennai"),
                new Employee("Kumar", 102, "Pune"),
                new Employee("Ezhil", 103, "Chennai"),
                new Employee("Maran", 104, "Bangalore"),
                new Employee("Bhakavathy", 105, "Chennai")
        );
       
        System.out.println("All Employees : ");
        employees.forEach(System.out::println);
       
        String filterCity ="chennai";
        List<Employee> employeesByCity = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getCity().equalsIgnoreCase(filterCity)) {
                employeesByCity.add(emp);
            }
        }


        System.out.println("\nEmployees in " + filterCity + ":");
        employeesByCity.forEach(System.out::println);

	}

}
