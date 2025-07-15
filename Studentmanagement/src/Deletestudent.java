import java.sql.*;
public class Deletestudent {
	 public static void main(String[] args) {
	    	String url ="jdbc:mysql://localhost:3306/student";
	    	String username = "root";
	    	String password = "0508";
	    	
	        try {
	            Connection c = DriverManager.getConnection(url,username,password);
	            String sql = "DELETE FROM detail WHERE id = 2";
	            PreparedStatement p = c.prepareStatement(sql);

	            int rows = p.executeUpdate();

	            if (rows > 0) {
	                System.out.println("Deleted successfully.");
	            } else {
	                System.out.println("No record found.");
	            }

	            c.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}

		
	


