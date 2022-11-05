package fundamentals.tasks01;

import java.util.Arrays;
import java.util.Scanner;

/*
Write an application that takes a positive number from the user (type int) and prints all prime numbers greater than 1
and less than the given number.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input positive number: ");
        int PositiveNumber = scanner.nextInt();
        scanner.close();

        boolean[] allNumbers = new boolean[PositiveNumber];
        Arrays.fill(allNumbers, true);

        for (int i = 2; i < allNumbers.length; i++) {
            if (allNumbers[i]) {
                for (int j = 2; j < allNumbers.length; j++) {
                    if (i * j >= PositiveNumber) {
                        break;
                    }
                    allNumbers[i * j] = false;
                }
            }
        }

        for (int i = 2; i < allNumbers.length; i++) {
            if (allNumbers[i]) {
                System.out.println(i);
            }
        }
    }
}
