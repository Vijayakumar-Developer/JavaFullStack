package com.io.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("output1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        String fileContent = sb.toString();
        System.out.println(fileContent);
    }
}
