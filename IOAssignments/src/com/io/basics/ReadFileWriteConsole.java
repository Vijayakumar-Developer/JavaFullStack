package com.io.basics;
import java.io.*;

public class ReadFileWriteConsole {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("output1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
