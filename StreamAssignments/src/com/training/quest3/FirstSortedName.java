package com.training.quest3;

import java.util.Arrays;
import java.util.List;

public class FirstSortedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Vijay","Ilamaran","Ezhil","Ilamaran");
		                     names.stream()
		                     .distinct()
		                     .sorted()
		                     .findFirst()
		                     .ifPresent(System.out::println);
		

	}

}
