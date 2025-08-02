package com.over.quest3;

public class ProcessMain {

	public static void main(String[] args) {
//		∙Create an object of Processor class    
//		∙Call the methods by passing the appropriate values(for double use 
//		decimal else will call the int method ) 
		Processor process = new Processor();
		process.calculate(3.0);
		process.calculate(2, 5);
		process.calculate(9.0, 6.0);
		process.calculate(3.3, 2);
		process.calculate(5);

//		} 
	}

}
