package com.training.quest3;

public class CompressorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFileCompressor zip = new ZipCompressor();
		IFileCompressor jar = new JarCompressor();
		IFileCompressor rar = new RarCompressor();
		
        zip.compressFile("file1.txt", "file2.txt");
        jar.compressFile("project.class", "readme.md");
        rar.compressFile("image.jpg", "video.mp4");

	}

}
