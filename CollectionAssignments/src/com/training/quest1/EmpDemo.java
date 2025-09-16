package com.training.quest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Course {
	private String courseName;
	private String type;

	public Course(String courseName, String type) {
		// super();
		this.courseName = courseName;
		this.type = type;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		return courseName + " (" + type + ")";
	}

}

class Employee {
    private String empName;
    private String department;
    private String city;
    
	public Employee(String empName, String department, String city) {
		//super();
		this.empName = empName;
		this.department = department;
		this.city = city;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		 return empName + "Dept : " + department + " City: " + city;
	}
	

}

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Course c1 = new Course("Spring Boot", "Backend");
        Course c2 = new Course("HTML & CSS", "Frontend");
        Course c3 = new Course("Selenium", "Testing");
        Course c4 = new Course("Angular", "React");

	
	
    List<Employee> backendEmps = Arrays.asList(
            new Employee("Vijay", "IT", "Chennai"),
            new Employee("Kumar", "IT", "Coimbatore")
    );
    
    List<Employee> frontendEmps = Arrays.asList(
            new Employee("Ezhil", "Web", "Mumbai"),
            new Employee("Kumaran", "Web", "Pune")
    );

    List<Employee> testingEmps = Arrays.asList(
            new Employee("Ila", "QA", "Bengaluru"),
            new Employee("Maran", "QA", "Mysuru")
    );
    
    Map<Course, List<Employee>> details = new HashMap<>();
    details.put(c1, backendEmps);
    details.put(c2, frontendEmps);
    details.put(c3, testingEmps);
    details.put(c4, null); 

    for (Map.Entry<Course, List<Employee>> entry : details.entrySet()) {
        System.out.println("Course: " + entry.getKey());
        if (entry.getValue() != null) {
            for (Employee e : entry.getValue()) {
                System.out.println("   " + e);
            }
        } else {
            System.out.println("   No employees assigned");
        }
    }
    
}
}
