package com.training.quest3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesStartingWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= Arrays.asList("saran","Vijay","Sasi","Santhosh","kumar");
		List<String> result = names.stream()
				              .distinct()
				              .filter(n -> n.startsWith("S"))
				              .collect(Collectors.toList());
		
		System.out.println(result);
		

	}

}
