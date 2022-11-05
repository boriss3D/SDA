package fundamentals.tasks01;
/*
Using regular expression write an app: User enters an email and your app shows if that is valid email address or not
email format: letters+numbers and proper domain format
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {

    public static void main(String[] args) {
        System.out.println("Please enter a valid email address: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        Pattern pattern = Pattern.compile("[a-z\\d]+@[a-z]+\\.[a-z]{2,3}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            System.out.println("Thank you!");
        } else {
            System.out.println("This is not a valid email address!");
        }
    }
}
