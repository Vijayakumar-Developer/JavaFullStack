package com.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	 
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java","Angular","Python");
		
		Map<String,Integer> map = list.stream()
				                 .collect(Collectors.toMap(str -> str, str -> str.length()));
		
		System.out.println(map);
	}

}
