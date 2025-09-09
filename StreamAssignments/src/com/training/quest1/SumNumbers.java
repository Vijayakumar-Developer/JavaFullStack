package com.training.quest1;

import java.util.stream.IntStream;

public class SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = IntStream.rangeClosed(1,10).sum();
		System.out.println("Sum of numbers :" +sum);

	}

}
