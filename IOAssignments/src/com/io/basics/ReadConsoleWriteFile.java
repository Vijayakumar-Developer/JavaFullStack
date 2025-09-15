package com.io.basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadConsoleWriteFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text 'exit' to stop ");
		try(BufferedWriter bw = new BufferedWriter (new FileWriter("output1.txt"))){
			
			String line;
			while(!(line = sc.nextLine()).equalsIgnoreCase("exit")) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("Written into the file successfully");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
