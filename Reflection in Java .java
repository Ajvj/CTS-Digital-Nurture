Reflection in Java program:
import java.lang.reflect.*;

class Demo {
    public void sayHello() {
        System.out.println("Hello from Reflection!");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Demo");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getDeclaredMethod("sayHello");
        method.invoke(obj);
    }
}
