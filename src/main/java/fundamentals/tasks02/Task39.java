package fundamentals.tasks02;

import java.util.Arrays;

/*
Write a Java program to find the second-largest element in an array: [1, 7, 3, 10, 9] Output: 9
 */
public class Task39 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        Arrays.sort(ints);
        System.out.println("Output: " + ints[ints.length - 2]);
    }
}
