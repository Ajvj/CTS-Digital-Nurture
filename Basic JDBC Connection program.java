Basic JDBC Connection program:
import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");

            // Step 3: Execute a query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Step 4: Display results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // Step 5: Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
