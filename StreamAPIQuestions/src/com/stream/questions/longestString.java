package com.stream.questions;


import java.util.*;

public class longestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Apple","Watermelon","Jack Fruit");
        
		String longest = list.stream().max(Comparator.comparing(String::length)).orElse("");
		System.out.println(longest);
	}

}
