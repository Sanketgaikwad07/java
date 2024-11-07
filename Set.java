import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseRetrieve {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Establish a connection
            conn = DriverManager.getConnection(url, user, password);

            // Step 2: Create a statement
            stmt = conn.createStatement();

            // Step 3: Execute a query to retrieve data
            String sql = "SELECT * FROM employees";
            rs = stmt.executeQuery(sql);

            // Step 4: Process the ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                double salary = rs.getDouble("salary");

                System.out.printf("ID: %d, Name: %s, Position: %s, Salary: %.2f%n", id, name, position, salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close the resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
