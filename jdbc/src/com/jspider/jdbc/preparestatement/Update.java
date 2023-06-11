package com.jspider.jdbc.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Update {

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
		String query = "UPDATE STD SET NAME=?,PHONE=?,PASSWORD=?,EMAIL=? WHERE ID=?";
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection(url);
		PreparedStatement ps = c.prepareStatement(query);
		
		ps.setString(1,name);
		ps.setLong(2,phone);
		ps.setInt(3,pass);
		ps.setString(4,email);
		ps.setInt(5,id);
		
		int count = ps.executeUpdate();
		if (count == 1) {
			System.out.println("updated");
		} else {
			System.err.println("not updated");
		}
		
		c.close();
	}
}
