package com.io.basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StoreFileInArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = java.nio.file.Files.readAllLines(new File("output1.txt").toPath());
		String[] arr = lines.toArray(new String[0]);
		for(String s : arr) {
			System.out.println(s);
		}

	}

}
