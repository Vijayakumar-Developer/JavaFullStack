package com.io.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileWriteFile {
public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader(new FileReader("output1.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));){
		String line;
		while((line = br.readLine()) != null) {
		bw.write(line);
		bw.newLine();
	}
		System.out.println("Copy content into output2.txt");}
	
	catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
