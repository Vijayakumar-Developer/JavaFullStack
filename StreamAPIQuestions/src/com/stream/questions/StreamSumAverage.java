package com.stream.questions;

import java.util.*;

public class StreamSumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(10,20,30,40,100);
		
		int sum = nums.stream()
				 .mapToInt(Integer::intValue)
				 .sum();
		double average = nums.stream()
				         .mapToInt(Integer::intValue)
				         .average()
				         .orElse(0.0);
		System.out.println("Sum :" + sum);
		System.out.println("Average: " +average);
		
	}

}
