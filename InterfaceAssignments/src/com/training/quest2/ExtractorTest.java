package com.training.quest2;

public class ExtractorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IExtractor extractor;
        extractor = new ZipExtractor();
        extractor.extractFiles("myArchive.zip");

        System.out.println();
        extractor = new JarExtractor();
        extractor.extractFiles("myLibrary.jar");

        System.out.println();

        extractor = new RarExtractor();
        extractor.extractFiles("myData.rar");

	}

}
