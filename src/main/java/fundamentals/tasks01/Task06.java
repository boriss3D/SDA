package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that takes a number n from the user (type int) and calculates the sum of the harmonic series from 1
to n, according to the formula below:
SUM = 1/1 + 1/2 + 1/3 ... 1/n
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        double sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("SUM = %.3f", sum);
    }
}
