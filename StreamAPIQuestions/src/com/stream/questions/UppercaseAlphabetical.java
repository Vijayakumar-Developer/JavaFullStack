package com.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UppercaseAlphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("grapes", "banana", "manago", "apple");
		                     names.stream()
		                     .filter(Objects::nonNull)
		                     .map(String::toUpperCase)
		                     .sorted()
		                     .forEach(System.out::println);

	}

}
