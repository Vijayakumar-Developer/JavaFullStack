package com.stream.questions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		
		String sentence = "Java is a good and java is poerful";
		
		Map<String , Long> wordCount = Arrays.stream(sentence.split ( " "))
			                        .collect(Collectors.groupingBy(word -> word , Collectors.counting()));
		System.out.println(wordCount);
	}
}
