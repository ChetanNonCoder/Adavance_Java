package com.jspider.jdbc.query;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class insertQuery {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String classname = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_wewjm5";
		String user = "root";
		String password = "root";
		String query = "INSERT INTO EMPLOYEE VALUES (2,'CHETAN','CHETAN@GMAIL.COM',1234567890)";
		
		Class.forName(classname);
		Connection connection = DriverManager.getConnection(url , user, password);
		Statement statement = connection.createStatement();
		statement.execute(query);
		statement.close();
	}
}
