package com.iofiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamEx1 {

	public static void main(String[] args) throws IOException{
		
		try (Scanner sc = new Scanner(new FileInputStream("c:\\users\\students\\documents\\sample.txt"), "UTF-8");){
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			if (sc.ioException()!=null) {
				throw sc.ioException();
			}
			sc.close();
		}
	}
}