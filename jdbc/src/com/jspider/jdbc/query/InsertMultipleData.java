package com.jspider.jdbc.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMultipleData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String classname = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_wewjm5";
		String user = "root";
		String password = "root";
		String query = "INSERT INTO EMPLOYEE VALUES(2,'PANKAJ','PANKAJ@GMAIL.COM',1234567899),(3,'SAURABH','SAURABH@GMAIL.COM',3729587329),(4,'DHANRAJ','BAHNKAJ@GMAIL.COM',1453456789)";
   
	    
		Class.forName(classname);
		Connection connection = DriverManager.getConnection(url ,user, password);
		Statement st = connection.createStatement();
		st.execute(query);
		st.close();
		
//	    Class.forName("com.mysql.cj.jdbc.Driver");
//	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_wewjm5", "root", "root");
//	    Statement st = c.createStatement();
//	    st.execute("insert into employee values(2,'PANKAJ','PANKAJ@GMAIL.COM',1),(3,'SAURABH','SAURABH@GMAIL.COM',372)");
//	    c.close();
	}
	
}
