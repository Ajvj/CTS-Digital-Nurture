Records program:
import java.util.List;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        Person p1 = new Person("Ajay", 23);
        Person p2 = new Person("Neha", 17);

        List<Person> people = List.of(p1, p2);

        System.out.println("Adults:");
        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
