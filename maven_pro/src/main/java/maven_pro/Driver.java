package maven_pro;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("1. Display Data");
		System.out.println("3. Insert Data");
		System.out.println("3. Update Data");
		System.out.print("Choose Operation :");
		int choose = scn.nextInt();
		
		switch (choose) {
		case 1:
			DisplayData ds = new DisplayData();
			
			try {
				ds.DisplayData();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 2: 
			System.err.print("Enter the Id :");
			int id = scn.nextInt();
			System.err.print("Enter the Name :");
			String name = scn.next();
			System.err.print("Enter the Phone No :");
			int phone = scn.nextInt();
			
			InsertQuery curd = new InsertQuery();
			
			try {
				curd.Saveperson(id, name, phone);
				System.out.println(" Inserted Successfully");
			} catch (ClassNotFoundException e) {
			   System.err.println("Not Inserted");
			} catch (IOException e) {
				System.err.println("Not Inserted");
			} catch (SQLException e) {
				System.err.println("Not Inserted");
			}
			
		case 3:
			System.err.print("Enter the Name :");
			String name1 = scn.next();
			System.err.print("Enter the Phone No :");
			int phone1 = scn.nextInt();
			System.err.print("Enter the Changing Id :");
			int id1 = scn.nextInt();
			UpdateQuery iq = new UpdateQuery();
			
			try {
				iq.Update(name1,phone1,id1);
				System.out.println("Updated");
			} catch (ClassNotFoundException e) {
				System.err.println("Not updated");
			} catch (IOException e) {
				System.err.println("Not updated");
			} catch (SQLException e) {
				System.err.println("Not updated");
			}
			
		case 4:
			System.out.println("Enter the id :");
			int id2 = scn.nextInt();
			
			DeleteQuery dq = new DeleteQuery();
			
			try {
				dq.Delete(id2);
				System.out.println("Deleted");
			} catch (ClassNotFoundException e) {
				System.out.println("Not Deleted");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			break;
		}
	}
}
