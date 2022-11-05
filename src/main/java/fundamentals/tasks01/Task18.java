package fundamentals.tasks01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write an application that reads a text from the user (type String) and checks whether the user sneezed, i.e. whether the
text equals "achooo!" with one or more letter "o" at the end of the expression (so both "acho!" and "achooooooo!" are
correct). Hint: use a regular expression with the appropriate quantifier.

 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        Pattern pattern = Pattern.compile("acho+!");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
    }
}
