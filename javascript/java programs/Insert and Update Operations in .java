Insert and Update Operations in JDBC program:
import java.sql.*;

public class StudentDAO {
    public static void insertStudent(int id, String name) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
        con.close();
        System.out.println("Inserted!");
    }

    public static void updateStudent(int id, String newName) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name = ? WHERE id = ?");
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
        con.close();
        System.out.println("Updated!");
    }

    public static void main(String[] args) throws Exception {
        insertStudent(103, "Neha");
        updateStudent(103, "Neha Sharma");
    }
}
