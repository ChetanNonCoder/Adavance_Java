package maven_pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class UpdateQuery {

   public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
	   FileInputStream file = new FileInputStream("dbconfig.propertires");
	   Properties properties = new Properties();
	   properties.load(file);
	   
	   Class.forName(properties.getProperty("className"));
	   Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("user"), properties.getProperty("password"));
	   return connection;
   }
   
     public void Update(String name , int phone , int id) throws ClassNotFoundException, IOException, SQLException {
    	 Connection connection = getConnection();
    	 PreparedStatement ps = connection.prepareStatement("UPDATE PERSONT SET NAME=?,PHONE=? WHERE ID=?");
    	 
    	 ps.setString(1,name);
    	 ps.setInt(2,phone);
    	 ps.setInt(3, id);
    	 
    	 int count = ps.executeUpdate();
    	 
    	 if (count == 1) {
			System.out.println("Data Updated");
		} else {
			System.out.println("Not Updated");
		}
     }
}
