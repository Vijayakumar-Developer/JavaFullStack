package com.training.question1;

public class Mobile {
	String model;
	double price;
	String brand;

	public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}

	void getDetails() {
		System.out.println("Modal : " + model);
		System.out.println("Price : " + price);
		System.out.println("Brand : " + brand);
	}

	String[] ShowFeatures() {
		String[] mobfeature = { "Dual Sim, 3G, 4G, 5G, VoLTE, Vo5G, Wi-Fi, NFC",
				"4400 mAh Battery with 25W Fast Charging" };
		return mobfeature;
		
	}
}