package com.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumbersPartionintoevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		Map<Boolean , List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
		System.out.println("Even Numbers :" + result.get(true));
		System.out.println("Odd Numbers :" + result.get(false));

	}

}
