package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that will read texts (variables of the String type) until the user gives the text "Enough!" and
then writes the longest of the given texts (not including the text "Enough!"). If the user does not provide any text,
write "No text provided".
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some text: ");

        String string;
        String theLongestString = "";
        int theLongestStringLength = 0;

        while (true) {
            string = scanner.nextLine();

            if ("Enough!".equals(string)) {
                if (theLongestStringLength == 0) {
                    System.out.println("No text provided");
                } else {
                    System.out.println("The longest of the given texts: " + theLongestString);
                }
                break;
            }

            if (string.length() > theLongestStringLength) {
                theLongestString = string;
                theLongestStringLength = string.length();
            }
        }
        scanner.close();
    }
}
