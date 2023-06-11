package com.jspider.jdbc.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SwitchOperation {
	

   	public static void main(String[] args) throws ClassNotFoundException, SQLException {
   	    Scanner sc = new Scanner(System.in);
		String classname = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/jdbc_wewjm5?user=root&password=root";
		
		Class.forName(classname);
		Connection c = DriverManager.getConnection(url);
		Statement st = c.createStatement();
		System.out.println("Enter your Operation");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
				ResultSet rs = st.executeQuery("select * from user");
				while (rs.next()){
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getString(5));
					System.out.println("-----------------------------------------------------------------------------------------");
				}
			break;
		case 2: 
			System.out.println("Enter id :");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter phone No :");
			int phone = sc.nextInt();
			System.out.println("Enter Email :");
			String email = sc.next();
			System.out.println("Enter Location :");
			String address = sc.next();
			
			st.execute("insert into user values(id,'name',phone,'email','address')");
		default:
			break;
		}
		
		
	}
}
