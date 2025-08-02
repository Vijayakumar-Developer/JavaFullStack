package com.over.quest3;

public class Processor {
	void calculate(double x) {
		System.out.println("Square root of " + x + " is: " + Math.sqrt(x));
	} // print the squareroot

	void calculate(int x, int y) {
		System.out.println("Product: " + (x * y));
	} // print the product

	void calculate(double x, double y) {
		System.out.println("Difference: " + (x - y));
	} // print the difference

	void calculate(double x, int y) {
		// print x power y
		System.out.println(x + " raised to power " + y + " is: " + Math.pow(x, y));
	}

	void calculate(int x) {
		// print the square
		System.out.println("Square of " + x + " is: " + (x * x));
	}

}
