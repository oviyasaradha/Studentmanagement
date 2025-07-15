import java.sql.*;
import java.util.Scanner;
public class Getstudent {
	


	
	    public static void main(String[] args) {
	    	
	    	String url ="jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password = "0508";
			
	        try {
	            Connection con = DriverManager.getConnection(url,username,password);

	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter Student ID: ");
	            int id = sc.nextInt();

	            String sql = "SELECT * FROM detail WHERE id = 101";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, id);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id"));
	                System.out.println("Name: " + rs.getString("name"));
	                System.out.println("Age: " + rs.getInt("age"));
	            } else {
	                System.out.println("Student not found.");
	            }

	            con.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}



