package fundamentals.tasks01;

import java.util.Scanner;

/*
Let's have an array of 10 number and ask user to enter one number
Check if user input exists in your array
 */
public class Task28 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        System.out.print("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();
        for (int i : ints) {
            if (userNumber == i) {
                System.out.println("We have this number in array!");
                break;
            }
        }
    }
}
