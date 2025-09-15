package com.io.basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CompareFilesLexicographically {
public static void main(String[] args) throws IOException {
	List<String> file1 = java.nio.file.Files.readAllLines(new File("output1.txt").toPath());
	List<String> file2 = java.nio.file.Files.readAllLines(new File("output2.txt").toPath());
	int result = String.join("",file1).compareTo(String.join("",file2));
	if(result == 0) {
		System.out.println("Files are equall");
		
	}else if(result < 0) {
		System.out.println("File 1 <File 2");
		
	}else {
		System.out.println("File 1 >  File 2");
	}
}
}
