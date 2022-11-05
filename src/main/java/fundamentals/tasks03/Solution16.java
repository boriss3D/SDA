package fundamentals.tasks03;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        int[] ints = new int[6];
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
            sum += ints[i];
        }
        System.out.println(sum/ints.length);
    }
}
