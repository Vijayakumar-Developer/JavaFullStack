package com.training.basic;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = { 20, 42, 6, 25, 30, 88 };
		int max1 = 0;
		int max2 = 0;

		if (a[0] > a[1]) {
			max1 = a[0];
			max2 = a[1];
		} else {
			max2 = a[0];
			max1 = a[1];
		}

		for (int i = 2; i <  a.length; i++ ) {
			if (a[i] > max1) {
				
				max2 = max1 ;
				max1 = a[i];

			} else if (a[i] > max2) {
				max2 = a[i];

			}
		}
		System.out.println("Second Largest element in the array is:" +max2);

	}

}
