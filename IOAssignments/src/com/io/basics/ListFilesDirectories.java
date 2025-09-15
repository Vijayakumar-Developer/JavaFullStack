package com.io.basics;

import java.io.File;

public class ListFilesDirectories {
	public static void main(String[] args) {
		File dir = new File("C://Users//vijai//eclipse-workspace//IOAssignments");
		String[] list = dir.list();
		if(list != null) {
			for(String name : list) {
				System.out.println(name);
			}
		}
	}

}
