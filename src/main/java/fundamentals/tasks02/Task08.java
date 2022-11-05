package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a java program to compare two strings lexicographically, ignoring case differences:
“This is a comparison” equals “THIS is A Comparison”
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a first string: ");
        String input = scanner.nextLine();
        System.out.print("Please input a second string: ");
        String input2 = scanner.nextLine();
        scanner.close();

        if (input.equalsIgnoreCase(input2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
