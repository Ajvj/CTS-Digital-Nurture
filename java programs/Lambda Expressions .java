Lambda Expressions program:
import java.util.ArrayList;
import java.util.Collections;

public class LambdaSortExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zoya");
        names.add("Alex");
        names.add("John");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names: " + names);
    }
}
