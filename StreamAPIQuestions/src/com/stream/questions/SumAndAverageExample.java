package com.stream.questions;

import java.util.*;

public class SumAndAverageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 10, 20, 30, 40, 50 };
		int sum = Arrays.stream(numbers).sum();
		double average = Arrays.stream(numbers).average().orElse(0.0);
		
		System.out.println("Sum:" + sum);
		System.out.println("Average: " +average);

	}

}
