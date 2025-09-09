package com.training.quest3;

import java.util.Arrays;

public class StringArrayToIntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] numbers = {"10","20","70"};
		int sum = Arrays.stream(numbers)
				 .mapToInt(Integer::parseInt)
				 .sum();
		System.out.println("Sum : " + sum);

	}

}

