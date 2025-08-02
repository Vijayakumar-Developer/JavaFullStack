package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mob1=new Mobile("Apple","iPhone 16e","Black");
		Mobile mob2=new Mobile("Samsung","Galaxy M06","Blue");
		Mobile mob3=new Mobile("OnePlus","Nord CE 7","Black");
		Mobile mob4=new Mobile("Google Pixel","Google Pixel 16e","white");
		Mobile mob5=new Mobile("Xiaomi","Xiaomi 15 Ultra","Black");
		Mobile[] mobileArray =new Mobile[5];
	//	mobileArray[0]=mob1;
		for (i=0;i<mobileArray.length;i++) {
			mobileArray[i].getDetails();
		}
//		Create 5 mobile objects as given below 
//	    Mobile mobile1 = new Mobile(“a”,”a”,29000); 
//	∙Add to a mobileArray as given below  
//	Mobile [] mobileArray = new Mobile[5]; 
//	mobileArray[0]=mobile1;  
//	∙Use another for loop, iterate the mobileArray and call getDetails() 
//	method to print each object 
//	∙Use another for loop,iterate the mobileArray and print the mobiles that 
//	has the brand as Samsung 
	}

}
