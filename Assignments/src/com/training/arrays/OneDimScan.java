package com.training.arrays;

import java.util.Scanner;

public class OneDimScan {

	public static void main(String[] args) {
		int[] nums = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}
		for (int val : nums) {
			System.out.println(val);
		}
	}

}
