package com.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListtoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("vijay", "apple", "manago", "banana");
		Set<String> set = list.stream().collect(Collectors.toSet());
		System.out.println("LisSet: " + set);
	}
}
