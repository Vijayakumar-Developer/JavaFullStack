package com.io.basics;

import java.io.File;
import java.text.SimpleDateFormat;

public class FilePropertiesCheck {
	 public static void main(String[] args) {
		File file = new File("newfile.txt");
		if(file.exists()) {
			System.out.println("Exists:");
			System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Is Directory? " + file.isDirectory());
            System.out.println("Is File? " + file.isFile());
            System.out.println("Size (bytes): " + file.length());
            System.out.println("Size (KB): " + file.length() / 1024.0);
            System.out.println("Size (MB): " + file.length() / (1024.0 * 1024));
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("Last Modified: " + sdf.format(file.lastModified()));
		}
		else {
			System.out.println("File Does not exist ");
		}
		
	}

}
