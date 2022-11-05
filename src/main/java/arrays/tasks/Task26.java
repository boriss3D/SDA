package arrays.tasks;

import java.util.Scanner;

/*
A sorted(in ascending order) array A[ ] with distinct elements is rotated at some unknown point, the task is to find
the minimum element in it.
 */
public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            Solution26 sol = new Solution26();
            System.out.println(sol.findMin(A, n));
        }
    }
}

class Solution26 {
    int findMin(int[] arr, int n) {
        if (arr[0] < arr[1] && arr[0] < arr[n - 1]) {
            return arr[0];
        }
        if (arr[n - 1] < arr[n - 2] && arr[n - 1] < arr[0]) {
            return arr[n - 1];
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
}