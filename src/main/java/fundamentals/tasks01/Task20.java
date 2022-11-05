package fundamentals.tasks01;

import java.util.Random;
import java.util.Scanner;

/*
Write an application that will play "too much, too little" game with you. At the beginning the application should
randomly choose a number from 0 to 100 (hint: use the Random.nextInt() method) and wait for the user to enter a number.
If the user gives a number greater than the number chosen by the computer, your application should print "too much" and
wait for the next number. If the user gives a smaller number, the application should print "not enough" and wait for
the next number in the same way. If the user provides the exact value, the application should print the word
"Congratulations!" and finish.
 */
public class Task20 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.print("Please try to guess the number: ");

        while (true) {
            userInput = scanner.nextInt();
            if (userInput > randomNumber) {
                System.out.print("Too much! Please try again: ");
            } else if (userInput < randomNumber) {
                System.out.print("Not enough! Please try again: ");
            } else {
                System.out.println("Congratulations!");
                break;
            }
        }
        scanner.close();
    }
}
