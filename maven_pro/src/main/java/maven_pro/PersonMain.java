package maven_pro;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		
		Scanner scn = new Scanner(System.in);
		PersonObject curd = new PersonObject();
		
		boolean condition = true;
		
		Person person = new Person();
		System.out.println("Enter the choice"+"\n"+"1. Save Person"+"\n"+""
				+ "2. Update Person"+"\n"+
				"3. Delete Person"+"\n"+""
				+ "4. Get Person By Id"+"\n"+""
			    + "5. Get All Person"
				+"\n"+"6. Exit");
		int choice = scn.nextInt();
		do {
			switch (choice) {
			case 1:{
				System.out.println("Enter the Id :");
				int id = scn.nextInt();
				System.out.println("Enter the Name :");
				String name = scn.next();
				System.out.println("Enter the phone no:");
				int phone = scn.nextInt();
				
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				
				curd.Saveperson(person);
			}
				break;
				
			case 2:{
				System.out.println("Enter the Id :");
				int id = scn.nextInt();
				System.out.println("Enter the Name :");
				String name = scn.next();
				System.out.println("Enter the phone no:");
				int phone = scn.nextInt();
				
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);
				
				curd.updatePerson(person);
			}
				break;
			case 3:{
				System.out.println("Enter the Id :");
				int id = scn.nextInt();
		
				person.setId(id);
				
				curd.deleteperson(person);
			}
				break;
			case 4:{
				System.out.println("Enter the Id :");
				int id = scn.nextInt();
		
				person.setId(id);
				
				curd.getpersonbyid(person);
			}
				break;
			case 5:{
				
				curd.getallperson();
			}
				break;
				
			default:
				
			  condition = false;
			}
		}while(condition);
	}
}
