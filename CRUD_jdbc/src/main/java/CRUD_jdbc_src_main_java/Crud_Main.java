package CRUD_jdbc_src_main_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Crud_Main {

	private static Connection connetion;
	private static Statement statement ;
	private static PreparedStatement preparedStatement;
	private static String query ;
	private final static String dburl ="jdbc:mysql://localhost:3306/employeedb";
	private final static String driverpath = "com.mysql.cj.jdbc.Driver";
	private final static String user = "root";
	private final static String password = "root";
	private static ResultSet resultset ;
	private static int result ;
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException {
	 
		try {
			Class.forName(driverpath);
			connetion = DriverManager.getConnection(dburl,user,password);
			statement = connetion.createStatement();
			
			//1. Create Emp Table 
			
			
			query = "CREATE TABLE EMP(EMPNO INT(4) PRIMARY KEY, "+" ENAME VARCHAR(45),"
					+ "JOB VARCHAR(20),SAL INT(10))";
			
			result = statement.executeUpdate(query);
			System.out.println("Table Created Successfully....!");
			result = 0;
			
			//2. Insert 5 Records
			
			
			query = "INSERT INTO EMP VALUES(?,?,?,?)";
			preparedStatement = connetion.prepareStatement(query);
			
			for(int i=1;i<=5;i++) {
				System.err.print("Enter empno for record " + i+";");
				preparedStatement.setInt(1, scn.nextInt());
				System.err.print("Enter ename for record " + i+";");
				preparedStatement.setString(2, scn.next());
				System.err.print("Enter job for record " + i+";");
				preparedStatement.setString(3, scn.next());
				System.err.print("Enter sal for record " + i+";");
				preparedStatement.setInt(4, scn.nextInt());
				
				result = result + preparedStatement.executeUpdate();
			}
			System.err.println(result+"Records Inserted Successfully...");
			result = 0;
			
			//3. Display Records 
			
		    query = "SELECT * FROM EMP";
		    resultset = statement.executeQuery(query);
		    
		    while (resultset.next()) {
		    	System.out.println(resultset.getInt(1) + " | " + resultset.getString(2) + " | " +  resultset.getString(3)
				+ " | " + resultset.getInt(4));
			}
		    
		    //4. Update One Record
		    
		    query = "update emp set job = ? where empno = ?";
			preparedStatement = connetion.prepareStatement(query);
			System.err.print("Enter new value for job");
			preparedStatement.setString(1, scn.next());
			System.err.print("Enter the empno");
			preparedStatement.setInt(2, scn.nextInt());

			result = preparedStatement.executeUpdate();
			System.out.println(result + " Record Updated Successfully..!!");
			result = 0;
			
			//5. Display All Records
			
			query = "select * from emp";
			resultset = statement.executeQuery(query);
			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + " | " + resultset.getString(2) + " | " + resultset.getString(3)
						+ " | " + resultset.getInt(4));
			}
			
			//6. Delete 1 Record
			
			query = "delete from emp where empno = ?";
			preparedStatement = connetion.prepareStatement(query);
			System.err.print("Enter the empno to delete : ");
			preparedStatement.setInt(1, scn.nextInt());
			result = preparedStatement.executeUpdate();
			System.out.println(result + " record deleted successfully..!!");
			result = 0;

			
			// 7. Display All Records
			query = "select * from emp";
			resultset = statement.executeQuery(query);
			while (resultset.next()) {
			System.out.println(resultset.getInt(1) + " | " + resultset.getString(2) + " | " + resultset.getString(3)
				               + " | " + resultset.getInt(4));
						}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connetion != null) {
					connetion.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (resultset != null) {
					resultset.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	   }
   }	
}
