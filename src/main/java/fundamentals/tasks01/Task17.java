package fundamentals.tasks01;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
Write an application that will read from the user the date of your next SDA classes and calculate how many days are left
to them.
Hint: read the date as String and parse it to LocalDate. Get the current date using LocalDate.now() method.
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter date of the next SDA classes(YYYY-MM-DD): ");
        String date = scanner.nextLine();
        scanner.close();

        LocalDate localDateFuture = LocalDate.parse(date);
        LocalDate localDateNow = LocalDate.now();
        Period period = Period.between(localDateNow, localDateFuture);
        System.out.println("Days are left: " + period.getDays());
    }
}
