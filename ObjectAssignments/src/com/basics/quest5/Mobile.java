package com.basics.quest5;

public class Mobile {
String model ;
String brand;
String color;
public Mobile(String model, String brand, String color) {
	super();
	this.model = model;
	this.brand = brand;
	this.color = color;
}
void getDetails() {
	System.out.println("Model:" +model);
	System.out.println("Brand:" +brand);
	System.out.println("Color:" +color);
}
}
