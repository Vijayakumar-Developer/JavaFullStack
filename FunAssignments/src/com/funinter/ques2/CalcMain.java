package com.funinter.ques2;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator sum = (x,y) ->System.out.println("Sum of x and y :" + (x+y));
		ICalculator product = (x,y) ->System.out.println("product of x and y :" + (x*y));
		ICalculator sqroot = (x,y) ->System.out.println("sqroot of x  :" + (Math.sqrt(x) +" sqroot of y:"+ Math.sqrt(y)));
		ICalculator cube = (x,y) ->System.out.println("cube of x :" + (x*x*x) +" cube of y"+ (y*y*y));
		
		sum.calculate(10, 20);
		product.calculate(10, 20);
		sqroot.calculate(10, 20);
		cube.calculate(10, 20);
		

	}

}
