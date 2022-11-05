package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that takes a positive number from the user (type int) and writes all
numbers from 1 to the given number, each on the next line, with the following changes:
● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input positive number: ");
        int positiveNumber = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= positiveNumber; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
