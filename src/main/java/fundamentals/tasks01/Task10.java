package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that gets one positive number (type int) from the user and calculates a sum of digits of the given
number.
Hint: to make some operations on every single digit of the number (digit by digit), you can calculate the remainder of
dividing the number by 10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next digit).
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter positive number: ");
        int positiveNumber = scanner.nextInt();
        scanner.close();

        int sum = 0;

        while (true) {
            if (positiveNumber < 10) {
                sum += positiveNumber;
                break;
            }
            sum += positiveNumber % 10;
            positiveNumber /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
