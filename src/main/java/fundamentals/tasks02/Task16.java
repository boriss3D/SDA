package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers: 10, 20, 30
Output: Average = 20
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter a number: ");
            sum += scanner.nextFloat();
        }
        scanner.close();

        System.out.printf("Average = %.2f", sum / 3.0);
    }
}
