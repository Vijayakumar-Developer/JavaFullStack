package com.stream.questions;

import java.util.stream.IntStream;

public class OddNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = IntStream.rangeClosed(10, 50).filter(n -> n % 2 != 0).sum();
		System.out.println("Sum of odd numbers between 10 and 50 : " + sum);

	}

}
