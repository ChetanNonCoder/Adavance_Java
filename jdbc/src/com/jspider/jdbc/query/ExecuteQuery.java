package com.jspider.jdbc.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String classname = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_wewjm5";
		String user = "root";
		String password = "root";
		String query ="SELECT * FROM EMPLOYEE";
		
		Class.forName(classname);
		Connection connection = DriverManager.getConnection(url , user, password);
		Statement statement = connection.createStatement();
		
		ResultSet rs = statement.executeQuery(query);
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getInt(4));
				
	}
}
