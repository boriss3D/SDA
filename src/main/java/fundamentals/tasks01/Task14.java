package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that reads two lowercase letters of the Latin alphabet (type char) and calculates how many
characters is there in the alphabet between given letters. Hint - use the ASCII code table and treat the characters as
int numbers.
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first letter: ");
        String input1 = scanner.nextLine();
        System.out.print("Please enter second letter: ");
        String input2 = scanner.nextLine();
        scanner.close();

        char character1 = input1.charAt(0);
        char character2 = input2.charAt(0);

        int charactersBetween = Math.abs(character1 - character2) - 1;
        System.out.println("Characters between given letters: " + charactersBetween);
    }
}
