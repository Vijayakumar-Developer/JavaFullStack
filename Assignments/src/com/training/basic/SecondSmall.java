package com.training.basic;

public class SecondSmall {

	public static void main(String[] args) {
		int[] a = { 20, 42, 6, 25, 30, 88 };
		int small1 = 0;
		int small2 = 0;

		if (a[0] < a[1]) {
			small1 = a[0];
			small2 = a[1];
		} else {
			small2 = a[0];
			small1 = a[1];
		}

		for (int i = 2; i <  a.length; i++ ) {
			if (a[i] < small1) {
				
				small2 = small1 ;
				small1 = a[i];

			} else if (a[i] < small2) {
				small2 = a[i];

			}
		}
		System.out.println("Second smallest element in the array is:" +small2);

}
}
