package com.stream.questions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class FilterNamesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("kumar", "kumaran", "Maran", "Bhakavathy");
		List<String> filterNames = names.stream().filter(name -> name.startsWith("k")).collect(Collectors.toList());
		System.out.println("Filtered Names : " + filterNames);

	}

}
