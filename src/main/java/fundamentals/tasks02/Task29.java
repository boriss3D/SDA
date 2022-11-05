package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a program that prints the first n numbers, with an n increment: n=4 Output: 4, 8, 12, 16
 */
public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int PositiveNumber = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= PositiveNumber; i++) {
            System.out.print(i * PositiveNumber + " ");
        }
    }
}
