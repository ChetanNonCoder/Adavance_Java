package com.jspider.filehandling.info;

import java.io.File;

public class FileDelete {
 
	public static void main(String[] args) {
		File file = new File("WWW.txt");
		
		if (file.exists()) {
			file.delete();
			System.out.println("File deleted successfully");
		}else {
			System.out.println("File does not exists");
		}
	}
}
