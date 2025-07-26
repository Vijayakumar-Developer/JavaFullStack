package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int arr[] = { 98, 102, 77, 55, 30 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Greatest number in the array is " + max);
	}

}
