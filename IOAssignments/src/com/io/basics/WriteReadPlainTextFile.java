package com.io.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadPlainTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"))) {
            bw.write("Hi Vijay , Try to write into file");
        }
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            br.lines().forEach(System.out::println);
        }

	}

}
