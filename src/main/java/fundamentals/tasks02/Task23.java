package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program that accepts an integer (n) and displays n, nn, nnn, nnnn, nnnnnn: 5
Output: 5, 55, 555, 5555, 55555
 */
public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int n = scanner.nextInt();
        scanner.close();
        String output = "";
        for (int i = 0; i < n; i++) {
            output += n;
            System.out.print(output);
            if (i != n - 1) {
                System.out.print(", ");
            }
        }
    }
}
