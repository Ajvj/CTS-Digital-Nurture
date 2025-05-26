Transaction Handling in JDBC program:
import java.sql.*;

public class BankTransaction {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "password")) {
            con.setAutoCommit(false); // Start transaction

            Statement st = con.createStatement();
            st.executeUpdate("UPDATE accounts SET balance = balance - 1000 WHERE id = 1");
            st.executeUpdate("UPDATE accounts SET balance = balance + 1000 WHERE id = 2");

            con.commit(); // Commit only if both updates succeed
            System.out.println("Transaction successful!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Transaction failed. Rolled back.");
        }
    }
}
