package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a java program to calculate the factorial value of given number: n=5 Output: 120 (1*2*3*4*5)
 */
public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int PositiveNumber = scanner.nextInt();
        scanner.close();

        int output = 1;

        for (int i = 1; i <= PositiveNumber; i++) {
            output *= i;
        }
        System.out.println("Output: " + output);
    }
}
