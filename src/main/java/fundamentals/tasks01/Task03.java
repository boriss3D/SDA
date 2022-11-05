package fundamentals.tasks01;

import java.util.Scanner;

/*
Write a program for solving a quadratic equation. The program should take three integers (coefficients of the quadratic
equation a, b, c) and calculate the roots x₁ and x₂ of the equation ax² + bx + c = 0
If delta ∆ comes out negative, print "Delta negative" and exit the program. Formulas you'll need:

∆ = b² - 4ac
x₁ = (-b - √∆) / 2a
x₂ = (-b + √∆) / 2a

 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input \"a\":");
        int a = scanner.nextInt();
        System.out.print("Please input \"b\":");
        int b = scanner.nextInt();
        System.out.print("Please input \"c\":");
        int c = scanner.nextInt();
        scanner.close();

        double delta = Math.pow(1.0 * b, 2.0) - 4.0 * a * c;

        if (Double.compare(0.0, delta) > 0) {
            System.out.println("Delta negative");
        } else {
            double x1 = (-1.0 * b - Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-1.0 * b + Math.sqrt(delta)) / (2.0 * a);
            System.out.println("x₁: " + x1);
            System.out.println("x₂: " + x2);
        }
    }
}
