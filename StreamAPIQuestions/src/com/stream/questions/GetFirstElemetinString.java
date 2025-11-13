package com.stream.questions;

import java.util.Arrays;
import java.util.*;

public class GetFirstElemetinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple", "Manago", "banana");

		Optional<String> firstElement = list.stream().findFirst();
		System.out.println(firstElement.orElse("No value"));

	}

}
