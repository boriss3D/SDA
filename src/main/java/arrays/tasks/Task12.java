package arrays.tasks;
/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N.
Find the missing element.
 */
//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution12 sln = new Solution12();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}

class Solution12 {
    int MissingNumber(int[] array, int n) {
        if (n - 1 == 1 && array[0] > 1) {
            return 1;
        }
        Arrays.sort(array);
        for (int i = 1; i < array[n - 2]; i++) {
            if (Arrays.binarySearch(array, i) < 0) {
                return i;
            }
        }
        return array[n - 2] + 1;
    }
}
