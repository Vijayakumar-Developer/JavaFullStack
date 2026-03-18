package com.stream.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java","Python","Angular","Java","React");
		
		Set<String> seen = new HashSet<>();
		
		List<String> duplicates = list.stream()
                                 .filter(s->!seen.add(s))
                                 .collect(Collectors.toList());
		System.out.println(duplicates);
		
	}
}
