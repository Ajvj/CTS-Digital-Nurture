Type Casting Example program:
public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.7;
        int i = (int) d;  // downcasting

        int j = 5;
        double d2 = j;    // upcasting (automatic)

        System.out.println("Double to Int: " + i);
        System.out.println("Int to Double: " + d2);
    }
}
