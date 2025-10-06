package com.stream.questions;

import java.util.*;
import java.util.stream.Collectors;

public class SquareNumbers {
//4.	Given a list of nums, square each number in the list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums= Arrays.asList(1,2,3,4,5);
		List<Integer> squared = nums.stream()
				                .map(n->n*n)
				                .collect(Collectors.toList());
		System.out.println("Squared List: "+ squared);

	}

}
