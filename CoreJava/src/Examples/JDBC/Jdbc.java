package Examples.JDBC;
import java.sql.*;
	public class Jdbc
	{
		
    public static void main(String[] args) {
		        // Connection parameters
		        String url = "jdbc:mysql://localhost:3306/mydatabase1";
		        String username = "root";
		        String password = "password";

		        // Database connection and statement objects
		        Connection conn = null;
		        Statement stmt = null;
		        ResultSet rs = null;

		        try {
		            // Register the JDBC driver
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            // Open a connection
		            conn = DriverManager.getConnection(url, username, password);

		            // Create a statement
		            stmt = conn.createStatement();

		            // Execute a query
		            String sql = "SELECT * FROM user";
		            rs = stmt.executeQuery(sql);

		            // Process the result set
		            while (rs.next()) {
		                int id = rs.getInt("id");
		                String name = rs.getString("name");
		                Date dob = rs.getDate("dob");
		                String email = rs.getString("email");
		                System.out.println("ID: " + id + ", Name: " + name + ", DOB: " + dob + ", Email: " + email);
		            }
		        } catch (SQLException se) {
		            se.printStackTrace();
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the result set, statement, and connection
		            try {
		                if (rs != null)
		                    rs.close();
		                if (stmt != null)
		                    stmt.close();
		                if (conn != null)
		                    conn.close();
		            } catch (SQLException se) {
		                se.printStackTrace();
		            }
		        }
		    }
		}
	
