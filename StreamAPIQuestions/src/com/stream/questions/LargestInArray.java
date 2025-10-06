package com.stream.questions;

import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.	Given an array of numbers, find the largest number in the list
		int[] arr = {12,45,78,34,57};
		int max = Arrays.stream(arr)
				  .max()
				   .getAsInt();
		
		System.out.println("Largest Number in Array : " +max);
		

	}

}
