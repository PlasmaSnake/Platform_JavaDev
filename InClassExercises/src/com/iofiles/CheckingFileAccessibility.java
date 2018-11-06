package com.iofiles;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckingFileAccessibility {

	public static void main(String[] args) throws DirectoryNotEmptyException, IOException {
		Path filePath = Paths.get("C:\\Users\\students\\documents\\sample.txt");

		
		//Outputs if file was deleted
		System.out.println("File/Directory is deleted: " + filePath.toFile().delete());
	}

}
	