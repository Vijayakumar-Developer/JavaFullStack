package com.training.basic;

public class Perfect {

	public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {

		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		
		if (sum == num) {
			System.out.println("perfect numbers from 1 to 100 are below:" + num);
		}

	}
	}

}
