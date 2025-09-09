package com.training.quest3;

import java.util.Arrays;
import java.util.List;

public class NamesLengthSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Vijayakumar","Ezhil","Maran");
		int totalLength = names.stream()
				          .mapToInt(String::length)
				          .sum();
				          //System.out.println("Sum of Lengths : " + totalLength);

	}

}

