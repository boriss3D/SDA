package fundamentals.tasks01;

import java.util.Arrays;

/*
Write a Java program to find the duplicate values of an array of integers: [1, 7, 3, 7, 10, 1, 9] Output: 1 & 7
 */
public class Task33 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 7, 10, 1, 9};
        Arrays.sort(ints);

        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] == ints[i + 1]) {
                System.out.println(ints[i]);
            }
        }
    }
}
