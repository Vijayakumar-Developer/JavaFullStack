package com.training.basic;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers between 1 and 1000 are :");
		for (int number = 1; number <= 1000; number++) {
			int originalNumber = number;
			int numberOfDigits = 0;
			int digitCounter = originalNumber;
			while (digitCounter != 0) {
				numberOfDigits++;
				digitCounter = digitCounter / 10;
			}

			int sumOfPowers = 0;
			int currentNumber = originalNumber;

			while (currentNumber != 0) {
				int digit = currentNumber % 10;
				int poweredDigit = 1;

				for (int i = 1; i <= numberOfDigits; i++) {
					poweredDigit *= digit;
				}

				sumOfPowers += poweredDigit;
				currentNumber = currentNumber / 10;
			}

			if (sumOfPowers == originalNumber) {
				System.out.println(originalNumber);
			}
		}
	}
}
