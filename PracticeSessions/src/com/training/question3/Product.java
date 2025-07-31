package com.training.question3;

public class Product {
	void itemsAvailable(String... itemNames) {
		// print the itemnames
		// System.out.println("Item name"+itemNames);
		for (String item : itemNames) {
			System.out.println(item);
		}
	}

	void showReviews(String itemName, String... reviews) { // print the itemname and the reviews

		// //System.out.println("ItemName: "+itemName + "Reviews: "
		// +reviews); 
		for(String rev:reviews) {
		System.out.println(rev); 
		}
	}
}