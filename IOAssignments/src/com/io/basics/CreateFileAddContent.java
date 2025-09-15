package com.io.basics;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileAddContent {
public static void main(String[] args) {
	try(FileWriter fw = new FileWriter("newfile.txt")){
		fw.write("This is a new file created");
		System.out.println("File created and content added");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
