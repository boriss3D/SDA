package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program that prints all the powers of a number under 100: 3
Output: 3, 9, 27, 81
 */
public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int result = 1;

        while (true) {
            result *= number;
            if (result > 100) {
                break;
            }
            System.out.println(result);
        }
    }
}
