package com.jspider.serializationanddeserialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspider.serializationdeserialization.user.User;

public class UserDeserialization {

	public static void main(String[] args) {
		
	   try {
		File file = new File("User.txt");
		
		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			
			System.out.println("Reading Object from file...!");
			
			User user = (User)inputStream.readObject();
			
			System.out.println(user);
			
			fileInputStream.close();
			inputStream.close();
			
		} else {
				System.out.println("File does not exists");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
}
