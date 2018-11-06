package com.iofiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		BufferedReader bufferStream = null;
		
		FileWriter outputStream = null;
		PrintWriter printStream = null;
		File readin = new File("C:\\Users\\Students\\documents\\sample.txt");
		File writeTo = new File("C:\\Users\\Students\\documents\\sampleTo.txt");
		try {
			inputStream = new FileReader(readin);
			bufferStream = new BufferedReader(inputStream);
			outputStream = new FileWriter(writeTo);
			printStream = new PrintWriter(outputStream);
			String l;
			while ((l = bufferStream.readLine()) != null) {
				printStream.println(l);
			}
		}finally {
			if (inputStream != null) inputStream.close();
			if (bufferStream != null) bufferStream.close();
			if (outputStream != null) outputStream.close();
			if (printStream != null) printStream.close();
		}
	}
}
