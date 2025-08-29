package com.training.quest2;

public class RarExtractor implements IExtractor {

	@Override
	public void extractFiles(String filename) {
		// TODO Auto-generated method stub
        System.out.println("Extracting from RAR: " + filename);
        System.out.println("Files => .pdf, .png, .mp4");
	}

}
