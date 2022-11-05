package fundamentals.tasks01;
/*
Do the sort task ascending and descending order without using Array sort method
Do the sort task ascending and descending order without using Array sort method and by bubble sort algorithm
 */

import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {
        int[] ints = {3, 5, 66, -3, 0, -97342};
        //Ascending
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int tempNumber = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tempNumber;
                }
            }
        }
        System.out.println(Arrays.toString(ints));

        int[] ints2 = {3, 5, 66, -3, 0, -97342};
        //Descending
        for (int i = 0; i < ints2.length; i++) {
            for (int j = 0; j < ints2.length - 1; j++) {
                if (ints2[j] < ints2[j + 1]) {
                    int tempNumber = ints2[j];
                    ints2[j] = ints2[j + 1];
                    ints2[j + 1] = tempNumber;
                }
            }
        }
        System.out.println(Arrays.toString(ints2));

        int[] ints3 = {3, 5, 66, -3, 0, -97342};
        //Ascending bubble
        for (int i = ints3.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (ints3[j] > ints3[j + 1]) {
                    int tempNumber = ints3[j];
                    ints3[j] = ints3[j + 1];
                    ints3[j + 1] = tempNumber;
                }
            }
        }
        System.out.println(Arrays.toString(ints3));

        int[] ints4 = {3, 5, 66, -3, 0, -97342};
        //Descending bubble
        for (int i = ints4.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (ints4[j] < ints4[j + 1]) {
                    int tempNumber = ints4[j];
                    ints4[j] = ints4[j + 1];
                    ints4[j + 1] = tempNumber;
                }
            }
        }
        System.out.println(Arrays.toString(ints4));
    }
}
