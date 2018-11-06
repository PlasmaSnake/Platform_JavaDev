package com.iofiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx1 {

	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		File readin = new File("C:\\Users\\Students\\documents\\sample.txt");
		File writeTo = new File("C:\\Users\\Students\\documents\\sampleTo.txt");
		try {
			inputStream = new FileReader(readin);
			outputStream = new FileWriter(writeTo);
			int c;
			while ((c = inputStream.read())!= -1) {
				outputStream.write(c);
			}
		}finally {
			if (inputStream != null) inputStream.close();
			if (outputStream != null) outputStream.close();
		}
	}

}
