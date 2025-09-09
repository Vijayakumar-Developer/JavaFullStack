package com.training.quest2;

import java.util.stream.IntStream;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0)
		                              .forEach(System.out::println);

	}

}
