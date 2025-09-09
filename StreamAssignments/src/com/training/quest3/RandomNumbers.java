package com.training.quest3;

import java.util.stream.Stream;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.generate(Math::random)
		.limit(5)
		.forEach(System.out::println);

	}

}


