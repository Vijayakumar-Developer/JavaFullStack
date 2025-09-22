package com.stream.questions;

import java.util.*;

public class UppercaseByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("banana","mango","Grapes","apple");
		             names.stream()
		             .filter(Objects::nonNull)
		             .map(String::toUpperCase)
		             .sorted(Comparator.comparingInt(String::length))
		             .forEach(System.out::println);
		     

	}

}
