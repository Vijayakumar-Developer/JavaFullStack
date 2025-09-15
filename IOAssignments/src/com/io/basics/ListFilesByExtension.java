package com.io.basics;

import java.io.File;

public class ListFilesByExtension {
public static void main(String[] args) {
	File dir = new File("C://Users//vijai//eclipse-workspace//IOAssignments");
	String[] files = dir.list((d,name) -> name.endsWith(".txt"));
	if(files != null) {
		for(String f : files) {
			System.out.println(f);
		}
	}
}
}
