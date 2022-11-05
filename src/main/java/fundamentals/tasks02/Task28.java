package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a program that prints the first n prime numbers: n = 4 Output: 2, 3, 5, 7
 */
public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int PositiveNumber = scanner.nextInt();
        scanner.close();

        int i = 2;
        int j = 2;
        int hits = 0;
        while (i <= PositiveNumber * PositiveNumber) {
            while (j <= PositiveNumber * PositiveNumber) {
                if (i % j == 0) {
                    if (i == j) {
                        System.out.print(i + " ");
                        hits++;
                    }
                    break;
                }
                j++;
            }
            if (hits == PositiveNumber) {
                break;
            }
            j = 2;
            i++;
        }
    }
}
