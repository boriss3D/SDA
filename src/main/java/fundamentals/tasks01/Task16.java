package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that takes 10 numbers from the user (type int) and write the length of the longest such subsequence
of these numbers, which is increasing.
For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5" as the length of the longest
increasing subsequence.
 */
public class Task16 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        scanner.close();

        int subsequenceLength = 0;
        int temp = 1;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] < ints[i + 1]) {
                temp++;
                if (subsequenceLength < temp) {
                    subsequenceLength = temp;
                }
            } else {
                temp = 1;
            }
        }
        System.out.println("Length of the longest increasing subsequence: " + subsequenceLength);
    }
}
