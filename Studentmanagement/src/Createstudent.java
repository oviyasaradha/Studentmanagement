import java.sql.*;
import java.util.Scanner;
public class Createstudent {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "0508";
		
		try{
			Connection c = DriverManager.getConnection(url,username,password);
			
			System.out.print("Enter the Student id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
	         String name = sc.nextLine();
	         
	        
	         System.out.println("Enter the DOB:");
	         String DOB = sc.nextLine();
	       

	          System.out.print("Enter Age: ");
	          int age = sc.nextInt();
	          sc.nextLine();

	         System.out.print("Enter Gender: ");
	          String gender = sc.nextLine();

	         System.out.print("Enter Phone Number: ");
	          String phone = sc.nextLine();

		        System.out.print("Enter Email: ");
			            String email = sc.nextLine();

			            System.out.print("Enter Address: ");
			            String address = sc.nextLine();

			            System.out.print("Enter Department: ");
			            String department = sc.nextLine();

			            

			            System.out.print("Enter Admission Date (YYYY-MM-DD): ");
			            String admissionDate = sc.nextLine();

			            String query = "INSERT INTO detail (id,name,DOB, age, gender, phone, email, address, department,admissionDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

			            PreparedStatement p = c.prepareStatement(query);
			            p.setInt(1, id);
			            p.setString(2, name);
			            p.setString(3, DOB);
						  
			            p.setInt(4, age);
			            p.setString(5, gender);
			            p.setString(6, phone);
			            p.setString(7, email);
			            p.setString(8, address);
			            p.setString(9, department);
			           p.setString(10, admissionDate);

			            int rows = p.executeUpdate();
			            if (rows > 0) {
			                System.out.println("Student added successfully!");
			            } else {
			                System.out.println("Failed to add student.");
			            }

			            c.close();
			        } catch (Exception e) {
			            System.out.println("Error occurred: " + e.getMessage());
			            e.printStackTrace();
			        }

			        sc.close();
			    }
			

		
		
	}


