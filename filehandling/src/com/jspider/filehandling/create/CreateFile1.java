package com.jspider.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

	public static void main(String[] args) {
		File file = new File("WWW.txt");
		
		try {
			file.createNewFile();
			System.out.println("File is Successfully Created...!");
		} catch (IOException e) {
		 System.out.println("File not Created..!!");
		}
	}
}
