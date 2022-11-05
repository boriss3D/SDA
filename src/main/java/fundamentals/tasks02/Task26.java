package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to print Fibonacci series of n terms: 10 Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */
public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int temp1 = 0;
        int temp2 = 1;
        System.out.print(temp1 + " " + temp2 + " ");
        for (int i = 0; i < number - 2; i++) {
            int temp3;
            System.out.print(temp1 + temp2 + " ");
            temp3 = temp1;
            temp1 = temp2;
            temp2 = temp2 + temp3;
        }
    }
}
