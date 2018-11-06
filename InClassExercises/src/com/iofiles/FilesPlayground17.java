package com.iofiles;


import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesPlayground17 {

	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Users\\students\\documents\\sample.txt");

		int count = filePath.getNameCount();
		//Outputs information about path
		System.out.printf("Path is %s\n"
				+ "File name is %s\n"
				+ "There are %s elements in the file path\n", filePath.toString(), filePath.getFileName(), count);
		
		//Outputs the files in the directory
		for (int i = 0; i < count; i++) System.out.printf("Element %s is %s", i, filePath.getName(i));
	}

}
