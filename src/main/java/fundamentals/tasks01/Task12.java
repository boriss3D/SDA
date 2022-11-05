package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that reads a text from the user (type String) and counts a percentage of occurrences of a space
character.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        int hits = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                hits++;
            }
        }

        double percentage = 1.0 * hits / text.length() * 100;

        System.out.printf("Percentage of occurrences of a space character: %.2f", percentage);
        System.out.println("%");
    }
}
