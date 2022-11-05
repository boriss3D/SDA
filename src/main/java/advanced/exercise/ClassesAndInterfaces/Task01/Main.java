package advanced.exercise.ClassesAndInterfaces.Task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        System.out.println(Arrays.toString(userValidator.validateEmails("boriss.harin@gmail.com",
                "@not.email")));
        System.out.println(Arrays.toString(userValidator.validateEmails("", null)));
    }
}
