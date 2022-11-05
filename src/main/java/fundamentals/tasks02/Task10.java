package fundamentals.tasks02;

import java.util.Scanner;

/*
Write a Java program to count the letters, spaces, numbers and other characters of an input string:
“Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33”
Output: 23 letters, 9 spaces, 8 numbers, 6 others
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a text: ");
        String input = scanner.nextLine();
        scanner.close();

        int letters = 0;
        int space = 0;
        int digit = 0;
        int other;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letters++;
            }
            if (Character.isSpaceChar(input.charAt(i))) {
                space++;
            }
            if (Character.isDigit(input.charAt(i))) {
                digit++;
            }
        }
        other = input.length() - letters - space - digit;
        System.out.println(letters + " letters, " + space + " spaces, " + digit + " numbers, " + other + " others");
    }
}
