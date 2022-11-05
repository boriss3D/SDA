package arrays.tasks;
/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 */

import java.util.Arrays;

class Task07 {
    public static void sort012(int[] a) {
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 2};
        sort012(ints);
        System.out.println(Arrays.toString(ints));
    }
}