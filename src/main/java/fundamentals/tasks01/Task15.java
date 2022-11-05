package fundamentals.tasks01;

import java.util.Scanner;

/*
Write an application that reads from the user 10 arbitrarily large numbers (variables of type int) and prints those that
occurred at least twice.
 */
public class Task15 {
    private final static int[] ints = new int[10];
    private final static int[] duplicated = new int[10];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("Numbers occurred at least twice:");
        printDuplicated();
        scanner.close();
    }

    private static void printDuplicated() {
        for (int i = 0; i < ints.length; i++) {
            int hits = 0;
            for (int anInt : ints) {
                if (ints[i] == anInt) {
                    hits++;
                }
            }
            if (hits > 1 && !isExist(ints[i])) {
                System.out.println(ints[i]);
                duplicated[i] = ints[i];
            }
        }
    }

    private static boolean isExist(int i) {
        int hits = 0;
        for (int k : duplicated) {
            if (k == i) {
                hits++;
            }
        }
        return hits > 0;
    }
}
