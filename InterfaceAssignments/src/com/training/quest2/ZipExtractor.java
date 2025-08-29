package com.training.quest2;

public class ZipExtractor implements IExtractor {

	@Override
	public void extractFiles(String filename) {
		// TODO Auto-generated method stub
        System.out.println("Extracting from ZIP: " + filename);
        System.out.println("Files => .txt, .jpeg, .doc");
	}

}
