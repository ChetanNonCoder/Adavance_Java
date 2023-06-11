package maven_pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DisplayData {

	public Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		
		FileInputStream file = new FileInputStream("dbconfig.propertires");
		Properties properties = new Properties();
		properties.load(file);
		
		Class.forName(properties.getProperty("className"));
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),
				                                            properties.getProperty("password"));
		return connection;
	}
	
	public void DisplayData() throws ClassNotFoundException, SQLException, IOException{
		
		Connection connection = getConnection();
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM PERSONT");
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
		 System.out.println("Id No: "+rs.getInt(1));
		 System.out.println("Name: "+rs.getString(2));
		 System.out.println("Phone No: "+rs.getInt(3));
		 
		 System.out.println("===============================");
		}
	}
	
}
