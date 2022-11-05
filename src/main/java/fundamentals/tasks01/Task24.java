package fundamentals.tasks01;
/*
Validated the age provided by the user
 */

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        Task24 task24 = new Task24();
        task24.validateAge(scanner.nextInt());
        scanner.close();
    }

    public void validateAge(int input) {
        if (input > 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are too young");
        }
    }
}
