package com.io.basics;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindLongestWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String longestWord = "";       
        try (Scanner sc = new Scanner(new File("sample.txt"))){
            while (sc.hasNext()) {
                String word = sc.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        System.out.println("Longest word: " + longestWord);
    }

}
