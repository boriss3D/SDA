package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that will take a positive number from the user (type int) and draw a wave with a given length and
height of 4 lines, according to the following example (fill empty spaces with spaces):
*      **       **
 *    *  *     *  *
  *  *    *   *
   **      **
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter wave length: ");
        int length = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < 4; i++) {
            int waveLeft = 0;
            int waveRight = 7;
            for (int j = 0; j < length; j++) {
                if (j > 0 && j % 8 == 0) {
                    waveLeft += 8;
                    waveRight += 8;
                }
                if (i == j - waveLeft || i == waveRight - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
