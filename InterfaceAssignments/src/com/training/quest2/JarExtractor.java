package com.training.quest2;

public class JarExtractor implements IExtractor {

	@Override
	public void extractFiles(String filename) {
		// TODO Auto-generated method stub
        System.out.println("Extracting from JAR: " + filename);
        System.out.println("Files => .class files");
	}

}
