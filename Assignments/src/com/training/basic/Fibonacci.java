package com.training.basic;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Below are Fibonacci numbers from 1 to 100: ");

		int n = 100;
		int firstnum = 1;
		int secondnum = 1;

		for (int i = 1; i <= n; i++) {
			System.out.println(firstnum + " ");
			int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;

			if (firstnum > 100) {
				break;
			}

		}
	}

}
