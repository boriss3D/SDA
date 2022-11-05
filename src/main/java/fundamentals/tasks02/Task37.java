package fundamentals.tasks02;

import java.util.Arrays;

/*
Write a Java program to insert an element at a specific position into an array: [1, 7, 3, 10, 9];
insert 4 at position 2; remember that an array starts from 0
Output: [1, 7, 4, 3, 10, 9]
 */
public class Task37 {
    public static void main(String[] args) {
        int[] ints = {1, 7, 3, 10, 9};
        int[] result = new int[ints.length + 1];

        int position = 2;
        int newValue = 4;

        for (int i = 0; i < result.length; i++) {
            if (i < position) {
                result[i] = ints[i];
            } else if (i == position) {
                result[i] = newValue;
            } else {
                result[i] = ints[i - 1];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
