package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to check whether a given string ends with the contents of another string:
“Java exercises” ends with “ses”
 */
public class Task09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a text: ");
        String input = scanner.nextLine();
        System.out.print("Please input end's pattern: ");
        String pattern = scanner.nextLine();
        scanner.close();

        System.out.println(pattern.equals(input.substring(input.length() - pattern.length())));
    }
}
