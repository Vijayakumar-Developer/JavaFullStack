package com.funinter.ques3;

public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMenu starters = items -> {
			System.out.println("Starters:");
			for (String item : items)System.out.println(item);
		};
		IMenu mainCourse = items -> {
            System.out.println("Main Course:");
            for (String item : items) System.out.println(item);
        };

        IMenu desserts = items -> {
            System.out.println("Desserts:");
            for (String item : items) System.out.println(item);
        };

        starters.printMenu(new String[]{"Soup", "Spring Roll"});
        mainCourse.printMenu(new String[]{"Biryani", "Paneer Butter Masala"});
        desserts.printMenu(new String[]{"Ice Cream", "Gulab Jamun"});
		starters.printMenu(new String[] { "soup", "Spring Roll" });
	}
}