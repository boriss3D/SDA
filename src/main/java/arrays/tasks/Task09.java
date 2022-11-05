package arrays.tasks;
/*
Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative
element at the end of array without changing the order of positive element and negative element.
 */
//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[(int) (n)];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Solution09 obj = new Solution09();
            obj.segregateElements(a, n);

            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");

            System.out.println();
        }
    }
}

// } Driver Code Ends
class Solution09 {
    public void segregateElements(int[] arr, int n) {
        // Your code goes here
        int[] negative = new int[n];
        int[] positive = new int[n];

        int indexNegative = 0;
        int indexPositive = 0;

        for (int i : arr) {
            if (i < 0) {
                negative[indexNegative] = i;
                indexNegative++;
            } else {
                positive[indexPositive] = i;
                indexPositive++;
            }
        }

        if (indexPositive >= 0) System.arraycopy(positive, 0, arr, 0, indexPositive);
        if (indexNegative >= 0) System.arraycopy(negative, 0, arr, indexPositive, indexNegative);
    }
}
