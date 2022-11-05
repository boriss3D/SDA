package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to compute the sum of the digits of an integer: 133
Output: 7
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int input = scanner.nextInt();
        scanner.close();
        int sum = 0;

        while (true) {
            sum += input % 10;
            input /= 10;
            if (input <= 1) {
                sum += input;
                break;
            }
        }
        System.out.println("Output: " + sum);
    }
}
