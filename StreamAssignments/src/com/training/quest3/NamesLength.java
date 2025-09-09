package com.training.quest3;

import java.util.Arrays;
import java.util.List;

public class NamesLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Vijayakumar","kumar","Ezhil");
		                     names.stream()
		                     .map(String::length)
		                     .forEach(System.out::println);
		                  

	}

}

