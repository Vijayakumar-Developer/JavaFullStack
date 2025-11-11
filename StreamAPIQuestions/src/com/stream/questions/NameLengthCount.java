package com.stream.questions;

import java.util.Arrays;
import java.util.*;

public class NameLengthCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("vijay", "Ezhilkumaran", "Ilamaran", "Raj", "Kumar");
		long count = names.stream().filter(name -> name.length() > 5).count();
		System.out.println("Total names having length >5 :" + count);

	}

}
