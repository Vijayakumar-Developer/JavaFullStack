package com.stream.questions;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNullEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("apple", "", null, "banana", " ", "mango");
		List<String> cleanedList = names.stream().filter(Objects::nonNull).filter(name -> !name.trim().isEmpty())
				.collect(Collectors.toList());
		System.out.println(cleanedList);

	}

}
