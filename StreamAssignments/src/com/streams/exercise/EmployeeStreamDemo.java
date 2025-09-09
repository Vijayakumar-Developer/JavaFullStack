package com.streams.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Employee> employees = Arrays.asList(
                new Employee("Raju","Ooty",2000,1),
                new Employee("Jeni","Bengaluru",24000,2),
                new Employee("Kevin","Chennai",12000,3),
                new Employee("Akash","Ooty",8000,4),
                new Employee("Tina","Mysore",15000,5),
                new Employee("Sri","Mysore",8400,6)
        );

        // 1. get the list of employees from a particular city
        System.out.println("Employees from Mysore:");
        employees.stream()
                .filter(e -> e.getCity().equalsIgnoreCase("Mysore"))
                .forEach(System.out::println);


	}

}
