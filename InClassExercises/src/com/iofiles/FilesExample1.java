package com.iofiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample1 {

	public static void main(String[] args) throws DirectoryNotEmptyException, IOException{
		Path filePath = Paths.get("C:\\Users\\students\\documents\\sample.txt");
		Path copyPath = Paths.get("C:\\Users\\students\\documents\\sample_copy.txt");
		Path deletePath = Paths.get("C:\\Users\\students\\documents\\test");
		File readin = filePath.toFile();
		File writeTo = new File("sampleTo.txt");
		
		System.out.println(readin.getAbsoluteFile());
		System.out.println(writeTo.getAbsoluteFile());
		
		System.out.println(readin.getParentFile());
		System.out.println(readin.isFile());
		System.out.println(readin.exists());
		System.out.println(readin.canWrite());
		System.out.println(readin.getFreeSpace());
		
		int count = filePath.getNameCount();
		for (int i = 0; i < count; i++) {
			System.out.printf("Element %s is %s\n", i, filePath.getName(i));
		}
		copyPath.toFile().delete(); // deletes sample_copy.txt if it exists
		
		File deleteMe = deletePath.toFile(); // deletes the directory test from \\documents
		System.out.print("Is test folder deleted? " + deleteMe.delete());
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter a dirpath:");
		String dirpath = input.readLine();
		System.out.println("Enter the dirname:");
		String dirname = input.readLine();
		File file = new File(dirpath, dirname);
		if (file.isDirectory()) {
			String[] arr = file.list();
			for (int i = 0; i < arr.length; i ++) {
				System.out.print(arr[i]);
				File f1 = new File((dirpath+"\\"+dirname), arr[i]);
				if (f1.isFile()) System.out.println(" is a file.");
				else System.out.println();
			}
			System.out.println("Number of directories/files in this folder " + arr.length);
 		}
		else System.out.println("Directory not found");
		
	}
}
