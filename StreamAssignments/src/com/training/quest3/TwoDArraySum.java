package com.training.quest3;

import java.util.Arrays;

public class TwoDArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = {{1,2,3},{4,5},{6,7,8}};
		int sum = Arrays.stream(arr)
				.flatMapToInt(Arrays::stream)
				.sum();
		System.out.println("Sum of 2D array:" +sum);

	}

}
