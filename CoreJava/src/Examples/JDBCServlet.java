package Examples;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/")
public class JDBCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
            String sql = "SELECT id, name, dob, email FROM user";
            rs = stmt.executeQuery(sql);

            // Set response content type
            response.setContentType("text/html");

            // Create a PrintWriter to write the HTML response
            PrintWriter out = response.getWriter();

            // Write the HTML response
            out.println("<html><body>");

            // Process the result set and generate HTML output
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Date dob = rs.getDate("dob");
                String email = rs.getString("email");
                out.println("ID: " + id + ", Name: " + name + ", DOB: " + dob + ", Email: " + email + "<br>");
            }

            out.println("</body></html>");

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
