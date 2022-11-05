package fundamentals.tasks01;
/*
Math class examples
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ABS of the input: " + Math.abs(scanner.nextInt()));
        System.out.println("POW² of the input:" + Math.pow(scanner.nextDouble(), 2.0));
        System.out.println("SIN of the input: " + Math.sin(scanner.nextDouble()));
        scanner.close();
    }
}
