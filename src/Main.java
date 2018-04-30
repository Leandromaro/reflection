import java.lang.reflect.Constructor;
import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        for (String name : args) {
            System.out.println("Methods from the class " + name);
            Class<?> clazz = name.getClass();
            // I let the constructors just like an example
            Constructor<?>[] constructors = clazz.getConstructors();
            stream(clazz.getMethods()).forEach(method -> {
                System.out.println("Method " + method.getName());
                stream(method.getParameterTypes())
                        .forEach(parameter -> System.out.println("Parameter: " + parameter.getName()));
            });
        }
    }
}
