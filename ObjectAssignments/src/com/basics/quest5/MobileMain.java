package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {

//		Create 5 mobile objects as given below 
//	    Mobile mobile1 = new Mobile(“a”,”a”,29000); 
//	∙Add to a mobileArray as given below  
//	Mobile [] mobileArray = new Mobile[5]; 
//	mobileArray[0]=mobile1;  
		Mobile mob1 = new Mobile("Apple", "iPhone 16e", "Black");
		Mobile mob2 = new Mobile("Samsung", "Galaxy M06", "Blue");
		Mobile mob3 = new Mobile("OnePlus", "Nord CE 7", "Black");
		Mobile mob4 = new Mobile("Google Pixel", "Google Pixel 16e", "white");
		Mobile mob5 = new Mobile("Xiaomi", "Xiaomi 15 Ultra", "Black");
		Mobile[] mobileArray = new Mobile[5];
		mobileArray[0] = mob1;
		mobileArray[1] = mob2;
		mobileArray[2] = mob3;
		mobileArray[3] = mob4;
		mobileArray[4] = mob5;

		System.out.println("All Mobile Details:");
		for (Mobile m : mobileArray) {
			m.getDetails();
		}

//	∙Use another for loop, iterate the mobileArray and call getDetails() 
//	method to print each object 
//	∙Use another for loop,iterate the mobileArray and print the mobiles that 
//	has the brand as Samsung 
		System.out.println("Mobile have a brand Samsung");
        for (Mobile m : mobileArray) {
        	
            if (m.brand.equals("Samsung")) {
                m.getDetails();
            }
        }

	}

}
