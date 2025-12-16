package com.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple","orange","water melon");
		String result = list.stream().collect(Collectors.joining(","));
		System.out.println("List string with comma seperator" + result);
	}
}
