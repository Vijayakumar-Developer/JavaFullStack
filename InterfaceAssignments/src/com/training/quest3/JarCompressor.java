package com.training.quest3;

public class JarCompressor implements IFileCompressor {

	@Override
	public void compressFile(String... files) {
		// TODO Auto-generated method stub
		System.out.println("compressed Jar file: ");
		for(String file : files) {
			System.out.println(" " + file);
		}
		
	}

}
