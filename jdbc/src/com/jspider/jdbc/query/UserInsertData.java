package com.jspider.jdbc.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInsertData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String classname = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/jdbc_wewjm5?user=root&password=root";
		
		Class.forName(classname);
		Connection c = DriverManager.getConnection(url);
		Statement st = c.createStatement();
		
		st.execute("INSERT INTO USER VALUES(1,'SAURABH',1232323432,'SAU@GMAIL.COM','PUNE'),"
				+ "(2,'PANKAJ',4232323432,'PANKAJ@GMAIL.COM','PUNE'),"
				+ "(3,'CHETAN',1732323432,'CHETAN@GMAIL.COM','PUNE'),"
				+ "(4,'DANNRAJ',7632323432,'DANRAJ@GMAIL.COM','PUNE')");
		
		System.out.println("Data insert Successfully..!");
		
		st.close();
		
	}
}
