package com.jspider.filehandling.info;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) {
		File file = new File("WWW.txt");
		
	   if (file.exists()) {
		System.out.println("File is Already Exists");
	}else {
		try {
			file.createNewFile();
			System.out.println("File is Created");
		} catch (IOException e) {
			System.out.println("File is not Created");
		}
	}
	   System.out.println("Name of the file :" + file.getName());
	   System.out.println("Location of the file :" + file.getAbsolutePath());
	   
	   if(file.canRead()) {
		   System.out.println("File is readable");
	   }else {
		   System.out.println("File is not readable");
	   }
	   if (file.canWrite()) {
		   System.out.println("File is writedable");
	} else {
		  System.out.println("File is not writedable");
	}
	   if (file.canExecute()) {
		   System.out.println("File is excutedable");
	}else {
		 System.out.println("File is not excutedable");
	}
	}
}
