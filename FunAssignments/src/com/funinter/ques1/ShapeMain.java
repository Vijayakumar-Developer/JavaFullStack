package com.funinter.ques1;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShape rectangle = (x, y) -> System.out.println("rectangle area: " + (x * y));
		rectangle.area(10, 5);

		IShape triangle = (x, y) -> System.out.println("triangle area: " + (0.5 * x * y));
		triangle.area(10, 5);

		IShape square = (x, y) -> System.out.println("square area: " + (x * x));
		square.area(10, 5);
	}

}
