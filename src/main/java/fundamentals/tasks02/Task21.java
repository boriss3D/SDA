package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program that takes a number and prints its multiplication table up to 10: 8 Output: 8, 16, 24, 32, ..., 80
 */
public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int input = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < 11; i++) {
            System.out.println(i * input);
        }
    }
}
