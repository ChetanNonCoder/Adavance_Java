package com.jspider.serializationanddeserialization.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.jspider.serializationdeserialization.user.User;

public class UserSerializaztion {

	public static void main(String[] args) {
		
		try {
			File file = new File("User.txt");
			if (file.exists()) {
				System.out.println("File is Alreadty Created...!");
			} else {
				file.createNewFile();
				System.out.println("File is created Successfully...!");
			

				User user = new User();
				
				user.setId(1);
				user.setUsername("chetan");
				user.setUsername("chetan_jadhav12");
				user.setPassword("1232131231");
				
				
				FileOutputStream fileOutputStream= new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				
				objectOutputStream.writeObject(user);
				
				objectOutputStream.close();
				fileOutputStream.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
