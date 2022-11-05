package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that will take a positive number from the user (type int) and calculate the Fibonacci number
at the indicated index. For example, if the number equals 5, your program should print the fifth Fibonacci number.
In Fibonacci sequence, each number is the sum of the two preceding ones. For example, the first few Fibonacci numbers are:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the number: ");
        int number = scanner.nextInt();
        scanner.close();

        int temp1 = 0;
        int temp2 = 1;

        for (int i = 0; i < number - 1; i++) {
            int temp = temp2;
            temp2 += temp1;
            temp1 = temp;
        }
        System.out.println("Result of " + number + " Fibonacci sum sequence: " + temp2);
    }
}
