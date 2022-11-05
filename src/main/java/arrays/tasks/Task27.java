package arrays.tasks;
/*
Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in
the array. The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
 */

import java.util.Scanner;

class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(new Solution27().max_sum(arr, n));
            t--;
        }
    }

}

class Solution27 {
    int max_sum(int[] A, int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int singleSum = 0;
        int firstSum = 0;
        int maxSum = 0;
        for (int i = 0; i < A.length; i++) {
            singleSum += A[i];
            firstSum += i * A[i];
        }
        for (int i = 0; i < A.length; i++) {
            firstSum = firstSum + singleSum - A[n - 1 - i] * n;
            maxSum = Math.max(maxSum, firstSum);
        }
        return maxSum;
    }
}
