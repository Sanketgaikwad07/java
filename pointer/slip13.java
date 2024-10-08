import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String custNumber = request.getParameter("custNumber");


        String url = "jdbc:postgresql://localhost:5432/your_database";
        String username = "username";
        String password = "password";

        try {

            Connection conn = DriverManager.getConnection(url, username, password);


            Statement stmt = conn.createStatement();


            String query = "SELECT * FROM customer WHERE custNumber = '" + custNumber + "'";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {

                out.println("<h2>Customer Details</h2>");
                out.println("<p>Customer Number: " + rs.getString("custNumber") + "</p>");
                out.println("<p>Name: " + rs.getString("name") + "</p>");
                out.println("<p>Email: " + rs.getString("email") + "</p>");
                out.println("<p>Phone: " + rs.getString("phone") + "</p>");
            } else {

                out.println("<h2>Error</h2>");
                out.println("<p>Customer with number " + custNumber + " not found.</p>");
            }


            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            out.println("<h2>Error</h2>");
            out.println("<p>Database Error: " + e.getMessage() + "</p>");
        }

        out.close();
    }
}
