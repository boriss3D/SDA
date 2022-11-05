package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that "stutters", that is, reads the user's text (type String), and prints the given text, in which
each word is printed twice.
For example, for the input: "This is my test" the application should print "This This is is my my test test".
 */
@SuppressWarnings("ALL")
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] strings = input.split(" ");

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
            System.out.print(" ");
            System.out.print(strings[i]);
            if (i != strings.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
