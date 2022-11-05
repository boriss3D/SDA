package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a java program to get the length of a given string: “This is Java!” Output: 13 characters
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a text: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(input.length() + " characters");
    }
}
