import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Database URL
        String user = "your_username"; // Database username
        String password = "your_password"; // Database password

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            
            // Step 1: Establish a connection
            conn = DriverManager.getConnection(url, user, password);

            // Step 2: Prepare SQL Insert Query
            String sql = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "John Doe");
            stmt.setString(2, "Software Engineer");
            stmt.setDouble(3, 80000);

            // Step 3: Execute Update
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close the resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
