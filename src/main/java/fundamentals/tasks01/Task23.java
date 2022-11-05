package fundamentals.tasks01;
/*
Printout to the console numbers from 0 to number provided by the user(included)
If user enter 0 - put some message
If user enter negative number - print start from user number to 0(included)
 */

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == 0) {
            System.out.println("0 is not valid!");
        } else if (userNumber > 0) {
            for (int i = 0; i <= userNumber; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = userNumber; i <= 0; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
