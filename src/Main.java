import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (String name : args) {
            Class<?> clazz = name.getClass();
            Constructor<?>[] constructors = clazz.getConstructors();
            Method[] methods = clazz.getMethods();
            for (Method method : methods
                    ) {
                System.out.println("Method " + method.getName());
                Arrays.stream(method.getParameterTypes()).forEach(parameter -> System.out.println("Parameter: " + parameter.getName()));
            }
        }
    }
}
