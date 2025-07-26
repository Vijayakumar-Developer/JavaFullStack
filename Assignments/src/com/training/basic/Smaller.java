package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		int arr[] = { 57, 50, 36, 23, 14 };
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];

			}
		}
		System.out.println("Smallest number in the array is " + small);
	}

}
