package com.stream.questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
	public static void main(String[] args) {
		
		String input = "Programming";
		
		Map<Character ,Long > frequencyMap = input.chars()
				                             .mapToObj(c -> (char) c)
				                             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(frequencyMap);
	}

}
