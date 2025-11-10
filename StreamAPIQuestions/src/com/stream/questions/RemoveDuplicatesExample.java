package com.stream.questions;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Vijay", "Kumar", "Ezhil", "Vijay", "Kumar");
		List<String> uniqueNames = names.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Names: " + uniqueNames);

	}

}
