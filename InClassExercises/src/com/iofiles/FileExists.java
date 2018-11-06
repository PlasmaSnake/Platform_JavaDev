// AUTHOR: Michael Matthew Sy

package com.iofiles;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExists {

	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Users\\students\\documents\\sample.txt");
		File file = new File(filePath.toString());
		
		// Outputs information about file
		System.out.printf("File Name: %s\n"
				+ "Path: %s\n"
				+ "Absolute Path: %s\n"
				+ "Parent: %s\n"
				+ "Exists: %s\n", file.getName(), file.getPath(),file.getAbsolutePath(),file.getParent(),file.exists());
		// If File exists, it will print more details
		if(file.exists()) {
			System.out.printf("Is writeable: %s\n"
					+ "Is readable: %s\n"
					+ "Is a directory: %s\n"
					+ "File Size in Bytes: %s", file.canWrite(), file.canRead(), file.isDirectory(), file.length());
		}
	}

}
