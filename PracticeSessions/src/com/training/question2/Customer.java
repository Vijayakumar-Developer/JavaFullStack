package com.training.question2;

public class Customer {
	public static void main(String[] args) {
		PaymentOptions cod = new PaymentOptions();      
		
		cod.pay(1000); 
		cod.pay(13333L,12,1000); 
		cod.pay("122kjkjdajs@upi",1000); 
		cod.pay("Axis","Vijayakumar",1000);
		}
	}