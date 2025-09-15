package com.io.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainTextFile {
public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader(new FileReader("output1.txt"))){
		br.lines().forEach(System.out::println);
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
