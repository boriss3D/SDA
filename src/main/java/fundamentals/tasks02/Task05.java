package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to extract the first half of a string of even length: “Programmer” Output: Progr
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a text: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(input.substring(0, input.length() / 2));
    }
}
