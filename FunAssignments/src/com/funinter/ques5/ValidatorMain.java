package com.funinter.ques5;

public class ValidatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] users = { "vijay", "kumar", "ezhil" };
		
		IValidator register = name -> {
			for (String user : users) {
				if (user.equalsIgnoreCase(name)) {
					return "You are already registered: " + name;
				}
			}
			return "You are registered " + name;
		};


		IValidator login = name -> {
			for (String user : users) {
				if (user.equalsIgnoreCase(name)) {
					return "You are logged in " + name;
				}
			}
			return "User not found!";
		};

		System.out.println(register.validateUser("Vijay"));
		System.out.println(register.validateUser("Ezhil"));
		System.out.println(login.validateUser("Kumar"));
		System.out.println(login.validateUser("Sam"));
	}
}
