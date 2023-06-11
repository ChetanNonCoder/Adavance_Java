package maven_pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class InsertQuery{

	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		FileInputStream fileInputStream = new FileInputStream("dbconfig.propertires");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		Class.forName(properties.getProperty("className"));
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("user"), properties.getProperty("password"));
		return connection;
	}
	
  

	public void Saveperson(int id, String name, int phone) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO PERSONT VALUES(?,?,?)");
		prepareStatement.setInt(1, id);
		prepareStatement.setString(2, name);
	    prepareStatement.setInt(3, phone);

		int count = prepareStatement.executeUpdate();

		if (count == 1) {
			System.out.println("=================================");
			System.out.print("Data");
		} else {
			System.err.println("Not Inserted");
		}

		connection.close();
	}
}

