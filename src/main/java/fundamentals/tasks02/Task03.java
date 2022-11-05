package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to convert a given string into lowercase: “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”
Output: the quick brown fox jumps over the lazy dog
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a text: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(input.toLowerCase());
    }
}
