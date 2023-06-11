package maven_pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class PersonObject{

	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		FileInputStream fileInputStream = new FileInputStream("dbconfig.propertires");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		Class.forName(properties.getProperty("className"));
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("user"), properties.getProperty("password"));
		return connection;
	}
	
  

	public void Saveperson(Person person) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO PERSONT VALUES(?,?,?)");
		prepareStatement.setInt(1, person.getId());
		prepareStatement.setString(2,person.getName());
	    prepareStatement.setInt(3, person.getPhone());

		int count = prepareStatement.executeUpdate();

		if (count == 1) {
			System.out.println("=================================");
			System.out.print("Data Inserted");
		} else {
			System.err.println("Not Inserted");
		}

		connection.close();
	}
	
	public void updatePerson(Person person) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("UPDATE PERSONT SET NAME =? ,PHONE =? WHERE ID=?");
		prepareStatement.setString(1, person.getName());
		prepareStatement.setInt(2, person.getPhone());
	    prepareStatement.setInt(3, person.getId());
		
	}
	
	public void deleteperson(Person person) throws ClassNotFoundException, IOException, SQLException {
		Connection connection = getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("DELETE FROM PERSONT WHERE ID=?");
		prepareStatement.setInt(1, person.getId());
	}
	
	public void getpersonbyid(Person person) throws SQLException, ClassNotFoundException, IOException {
		Connection connection = getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM PERSONT WHERE ID =?");
		prepareStatement.setInt(1, person.getId());
	}
	
	public void getallperson() throws SQLException, ClassNotFoundException, IOException {
		Connection connection = getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM PERSONT");
		ResultSet rs = prepareStatement.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
	}
	
}