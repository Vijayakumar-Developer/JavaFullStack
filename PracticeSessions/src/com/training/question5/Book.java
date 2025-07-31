package com.training.question5;

public class Book {
	// create a class Book with title, author, bookId,price
	String title;
	String author;
	int bookId;
	double price;

	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	} 
	// create 1 constr with title // 1 constr with title, price // 1 constr with
		// title, author, price 
	void printDetails(){ // print the properties. if the
		// value is not there it should not be printed 
	if (title != null) {
		System.out.println("Title: " + title); 
		} 
	if (author != null) {
		 System.out.println("Author: " + author);
		 } 
	if (price != 0.0) {
		 System.out.println("Price: " + price);
		 }
	}
}

