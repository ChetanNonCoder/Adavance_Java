package com.jspider.jdbc.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PrepareStatement {

	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id :");
		int id = sc.nextInt();
		System.out.print("Enter the name :");
		String name = sc.next();
		System.out.print("Enter the Phone no :");
		long phone = sc.nextLong();
		System.out.print("Enter the Password");
		int pass = sc.nextInt();
		System.out.print("Enter the Email :");
		String email = sc.next();
		
		String url = "jdbc:mysql://localhost:3306/studentdb?user=root&password=root";
		String query = "INSERT INTO STD VALUES(?,?,?,?,?)";
		
		//1st Step :=
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		
		//2nd Step :=
		
		Connection connection = DriverManager.getConnection(url);
	
		//3rd Step :=
		
		PreparedStatement ps = connection.prepareStatement(query);
		
		//4th Step := 
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setLong(3,phone);
		ps.setInt(4, pass);
		ps.setString(5,email);
		
		int count = ps.executeUpdate();
		
		if (count==1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		
		
		//5th Step:= 
		connection.close();
	}
}
