package jdbc_wejm5_product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class ProductMain {

	public static void main(String[] args) throws SQLException, IOException {
		
		Product product1 = new Product();
		product1.setId(7);
		product1.setName("TV");
		product1.setCost(20000);
		product1.setManufacture("LG");
		
		Product product2 = new Product();
		product2.setId(5);
		product2.setName("LAPTOP");
		product2.setCost(1000000);
		product2.setManufacture("HP");
		
		Product product3 = new Product();
	    product3.setId(4);
	    product3.setName("AC");
	    product3.setCost(10030000);
	    product3.setManufacture("BLUESTAR");
	    
	    List<Product> list = new ArrayList<Product>();
	    list.add(product1);
	    list.add(product2);
	    list.add(product3);
	    
	    Driver driver = new Driver();
	    DriverManager.registerDriver(driver);
	    FileInputStream file = new FileInputStream("config.properties");
	    
	    Properties properties = new Properties();
	    properties.load(file);
	    
	    
	    Connection connection = DriverManager.getConnection(properties.getProperty("url"),
	    		                                            properties.getProperty("user"),
	    		                                            properties.getProperty("password"));
	    
	   PreparedStatement ps =  connection.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?)");
	   
	   for(Product product : list) {
		  ps.setInt(1,product.getId());
		  ps.setString(2,product.getName());
		  ps.setInt(3,product.getCost());
		  ps.setString(4,product.getManufacture());
		  
		  ps.addBatch();
	   }
	   
	   ps.executeBatch();
	   
	   connection.close();
	    
	}
}
