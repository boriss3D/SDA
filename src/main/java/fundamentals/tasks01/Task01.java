package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that will read diameter of a circle (variable of type float) and calculate perimeter of given circle.
Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input diameter: ");
        float diameter = scanner.nextFloat();
        scanner.close();

        System.out.printf("Perimeter of given circle(π = 3.14): %.2f", 3.14 * diameter);
        System.out.println();
        System.out.printf("Perimeter of given circle(π = Math.PI): %.2f", Math.PI * diameter);
    }
}
