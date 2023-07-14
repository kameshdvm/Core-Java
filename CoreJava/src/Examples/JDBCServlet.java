package Examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import com.mysql.cj.xdevapi.Statement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
            stmt = (Statement) conn.createStatement();

            // Execute a query
            String sql = "SELECT id, name, dob, email FROM user";
            rs = ((java.sql.Statement) stmt).executeQuery(sql);

            // Set response content type
            response.setContentType("text/html");

            // Create a PrintWriter to write the HTML response
            PrintWriter out = response.getWriter();

            // Write the HTML response
            out.println("<html><head></head><body>");

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
                    ((PrintWriter) stmt).close();
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
