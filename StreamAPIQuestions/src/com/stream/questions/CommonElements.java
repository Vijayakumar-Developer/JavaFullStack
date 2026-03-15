package com.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
	
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Java","Angular","python","Sql");
        List<String> list2 = Arrays.asList("python","Java","React","sql");
        
        List<String> common = list1.stream().
        		              filter(list2::contains)
        		              .collect(Collectors.toList());
        System.out.println(common);
		
	}

}
