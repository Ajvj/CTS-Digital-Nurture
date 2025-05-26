HashMap Example program:
import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");

        System.out.print("Enter student ID to find: ");
        int id = sc.nextInt();

        if (studentMap.containsKey(id)) {
            System.out.println("Student: " + studentMap.get(id));
        } else {
            System.out.println("ID not found.");
        }
    }
}
