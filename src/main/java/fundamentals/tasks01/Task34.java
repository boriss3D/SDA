package fundamentals.tasks01;

import java.util.Scanner;

/*
Write a java program to calculate the factorial value of given number: n=5 Output: 120 (1*2*3*4*5)
 */
public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();
        scanner.close();

        int result = 1;

        if (number != 0 && number != 1) {
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
        }
        System.out.println("Output = " + result);
    }
}
