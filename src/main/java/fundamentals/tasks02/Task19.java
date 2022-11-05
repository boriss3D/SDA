package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to compare two numbers and print if they are equal or different, smaller, larger, smaller or equal,
larger or equal: 25; 39
25 != 39
25 < 39
25 <= 39
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        System.out.println("Equal? - " + (number1 == number2));
        System.out.println("Different? - " + (number1 != number2));
        System.out.println("Smaller? - " + (number1 < number2));
        System.out.println("Larger? - " + (number1 > number2));
        System.out.println("Smaller or Equal? - " + (number1 <= number2));
        System.out.println("Larger or Equal? - " + (number1 >= number2));
    }
}
