package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class insertQuery {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step-1 Load driver 
		//To Load driver to connect with database 
		Class.forName("com.mysql.cj.jdbc.Driver");
		 //Step-2 Establish connection
		//Connection between database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2db","root","root");
		
		//Step-3 Create statement
		//to execute SQL Query
		
		Statement statement=connection.createStatement();
		
		//Step-4 Execute Statement
		statement.execute("Insert into new_table values(1,'Chetan',951547896)");
		
		
		//Step-5 Close Connection
		connection.close();
		
		
		
		
		
		
		
		
		 
		 
	}
}
