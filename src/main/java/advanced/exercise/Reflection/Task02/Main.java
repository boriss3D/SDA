package advanced.exercise.Reflection.Task02;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student = new Student("Boriss");
        System.out.println(student.firstName());

        Field directChange = student.getClass().getDeclaredField("firstName");
        directChange.setAccessible(true);
        directChange.set(student, "NotBoriss");
        directChange.setAccessible(false);
        System.out.println(student.firstName());
    }
}
