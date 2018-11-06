package com.iofiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesPlayground21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File playground = new File("C:\\Users\\Students\\Desktop\\playground");
		System.out.println("Created playground directory: "+ playground.mkdir());
		System.out.println("Check if it is a directory: " + playground.isDirectory());
		new File(playground.getAbsolutePath()+"/first").mkdir();
		File newFile = new File(playground.getAbsolutePath()+"/simple.txt");
		newFile.createNewFile();
		System.out.println(newFile.getName());
		Files.move(Paths.get(newFile.getPath()),
				Paths.get(playground.getAbsolutePath()+"/first/"+(newFile.getName())), 
						StandardCopyOption.REPLACE_EXISTING);
	}

}
