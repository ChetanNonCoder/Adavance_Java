package com.jspider.jdbc.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String classname = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_wewjm5";
		String user = "root";
		String password = "root";
		String query = "delete from employee where idemployee = 1";
		
		Class.forName(classname);
		Connection c = DriverManager.getConnection(url, user, password);
		
		Statement st = c.createStatement();
		
		int res = st.executeUpdate(query);
		if(res ==1)
			System.out.println("Deleted");
		else
			System.out.println("Not Deleted");
		
		c.close();
	}
}
