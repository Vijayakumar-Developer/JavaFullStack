package com.javalearn.basics;

public class Ternary {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String result = a > b ? "a is greater" : "b is greater";
		System.out.println(result);

		String name = "Priya";
		String checklogin = name.equals("Priya") ? "Welcome Priya" : "Wrong Username";
		System.out.println(checklogin);
	}

}
