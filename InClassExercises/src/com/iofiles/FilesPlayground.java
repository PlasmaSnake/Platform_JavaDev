package com.iofiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesPlayground {

	public static void main(String[] args) throws IOException {
		File newFile = null;
		File playground = new File("C:\\users\\students\\documents\\playground");
		playground.mkdir();
		System.out.println("Playground is made succesfully? "+ playground.isDirectory());

		// directory creation of three parks
		File parkOne = new File(playground.getAbsolutePath() + "/ParkOne");
		parkOne.mkdir();
		File parkTwo = new File(playground.getAbsolutePath() + "/ParkTwo");
		parkTwo.mkdir();
		File parkThree = new File(playground.getAbsolutePath() + "/ParkThree");
		parkThree.mkdir();
		
		//park one
		newFile = new File(parkOne.getAbsolutePath() + "/Emma.txt");
		newFile.createNewFile();
		newFile = new File(parkOne.getAbsolutePath() + "/Olivia.txt");
		newFile.createNewFile();
		
		//park three
		newFile = new File(parkThree.getAbsolutePath() + "/Ethan.txt");
		newFile.createNewFile();
		newFile = new File(parkThree.getAbsolutePath() + "/Liam.txt");
		newFile.createNewFile();
		
		// park two
		newFile = new File(parkTwo.getAbsolutePath() + "/Aiden.txt");
		newFile.createNewFile();
		newFile = new File(parkTwo.getAbsolutePath() + "/Ava.txt");
		newFile.createNewFile();
		newFile = new File(parkTwo.getAbsolutePath() + "/Logan.txt");
		newFile.createNewFile();
		newFile = new File(parkTwo.getAbsolutePath() + "/Mia.txt");
		newFile.createNewFile();
		
		System.out.println("Moving everyone from Park Two to Park One");
		String[] namesTwo = parkTwo.list();
		for (int i = 0; i < namesTwo.length; i++) {
			Files.move(Paths.get(parkTwo.getAbsolutePath()+"/", namesTwo[i]), 
					Paths.get(parkOne.getAbsolutePath()+"/"+namesTwo[i]),
					StandardCopyOption.REPLACE_EXISTING);
		}
		System.out.println("Moving everyone from Park Three to Park One");
		String[] namesThree = parkThree.list();
		for (int i = 0; i < namesThree.length; i++) {
			Files.move(Paths.get(parkThree.getAbsolutePath()+"/", namesThree[i]), 
					Paths.get(parkOne.getAbsolutePath()+"/"+namesThree[i]),
					StandardCopyOption.REPLACE_EXISTING);
		}
		
	}
	
}
