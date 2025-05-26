Stream API program:
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 11, 12);
        
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());

        System.out.println("Even numbers: " + evens);
    }
}
