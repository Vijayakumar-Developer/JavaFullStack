package com.io.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstThreeLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            for (int i = 0; i < 5; i++) {
                String line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }

        }
	}

}
