package com.io.basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt", true))) {
            bw.write("\n Appended the text content");
            System.out.println("Text appended");
        }

	}

}
