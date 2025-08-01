package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		Book bookdetails = new Book("Java Sprib Boot", "Sripriya", 600.0, "Premium");
		bookdetails.getDetails();
		bookdetails.checkBookType();

	}

}
