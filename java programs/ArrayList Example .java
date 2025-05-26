ArrayList Example program:
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter student names (type 'stop' to finish):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("stop")) break;
            students.add(name);
        }

        System.out.println("Students entered:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
