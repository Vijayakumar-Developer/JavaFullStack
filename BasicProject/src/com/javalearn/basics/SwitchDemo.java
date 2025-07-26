package com.javalearn.basics;

public class SwitchDemo {

	public static void main(String[] args) {

		int a =10;
		int b=5;
		  String option="*"; //+ - / *
		  switch(option) {
		   case "+":
		    System.out.println(a+b);
		    break;
		   case "-":
		    System.out.println(a-b);
		    break;
		   case "*":
		    System.out.println(a*b);
		    break;
		   case "/":
		    System.out.println(a/b);
		    break;
		   default:
		    System.out.println("please select correct choice");
		}

	}

}
