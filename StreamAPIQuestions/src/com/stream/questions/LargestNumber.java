package com.stream.questions;

import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.	Given a list of nums, find the largest number in the list.
		List<Integer>nums = Arrays.asList(13,45,67,56,40);
		Integer largest = nums.stream()
				                .max(Integer::compare)
				                .get();
		System.out.println("Largest Num :" + largest);
		

	}

}
