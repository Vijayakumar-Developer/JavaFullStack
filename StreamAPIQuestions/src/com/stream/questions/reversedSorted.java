package com.stream.questions;

import java.util.*;
import java.util.stream.Collectors;

public class reversedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple", "banana", "watermeleon", "kiwi", "orange");

		List<String> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(reverseOrder);
	}

}
