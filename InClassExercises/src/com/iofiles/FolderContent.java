// AUTHOR: Michael Matthew Sy
package com.iofiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FolderContent {

	public static void main(String[] args) throws IOException{
		// For user input for directory
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a dirpath:");
		String dirpath = input.readLine();
		System.out.println("Enter the dirname:");
		String dirname = input.readLine();
		File file = new File(dirpath, dirname);
		
		// Iterates through each folder/file
		if (file.isDirectory()) {
			String[] arr = file.list();
			for (int i = 0; i < arr.length; i ++) {
				//Displays each folder/file
				System.out.print(arr[i]);
				File f1 = new File((dirpath+"\\"+dirname), arr[i]);
				//Outputs if arr[i] is a file
				if (f1.isFile()) System.out.println(" is a file.");
				else System.out.println();
			}
			System.out.println("Number of directories/files in this folder " + arr.length);
 		}
		else System.out.println("Directory not found");
	}

}
