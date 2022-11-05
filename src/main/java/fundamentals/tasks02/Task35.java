package fundamentals.tasks02;

import java.util.Arrays;

/*
Write a Java program to reverse an array of integer values: [1, 7, 3, 10, 9]
Output: [9, 10, 3, 7, 1]
 */
public class Task35 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        int[] temp = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            temp[ints.length - 1 - i] = ints[i];
        }
        ints = temp;

        System.out.println(Arrays.toString(ints));
    }
}
