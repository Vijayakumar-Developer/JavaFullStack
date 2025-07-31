package com.training.question5;

public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book("Vel paari");
		Book b2 = new Book("Spring Learn", 10000.0);
		Book b3 = new Book("Java learn", "Vijay", 2000.0);
		b1.printDetails();
		b2.printDetails();
		b3.printDetails();
	}
}