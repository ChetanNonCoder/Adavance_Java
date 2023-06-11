package com.jspider.jdbc.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String classname = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/jdbc_wewjm5";
		String user = "root";
		String password = "root";
		String query = "SELECT * FROM EMPLOYEE";
		
		Class.forName(classname);
		Connection c = DriverManager.getConnection(url,user,password);
		Statement st = c.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		 while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getLong(4));
			System.out.println("======================");
		}
		
	}
}
