package advanced.exercise.Reflection.Task01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTool {

    public static void fieldsGetter(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        System.out.print("Fields of the class " + clazz.getSimpleName() + " -> ");
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.print(field.getName() + "  ");
        }
        System.out.println();
    }

    public static void methodGetter(Object object) {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        System.out.print("Methods of the class " + clazz.getSimpleName() + " -> ");
        for (Method method : methods) {
            System.out.print(method.getName() + "  ");
        }
        System.out.println();
    }

    public static void constructorGetter(Object object) {
        Class<?> clazz = object.getClass();
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.print("Constructors of the class " + clazz.getSimpleName() + " -> ");
        for (Constructor<?> constructor : constructors) {
            System.out.print(Arrays.toString(constructor.getParameterTypes()) + "  ");
        }
    }
}
