package arrays.tasks;
/*
Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there
are repetitions, then only one occurrence of element should be printed in the union.
Your Task:
Complete doUnion function that takes the a, n, b, m as parameters and returns the count of union elements of the two arrays.
The printing is done by the driver code.
 */
//{ Driver Code Starts

import java.util.Arrays;
import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {

        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        //Taking total count of testcases
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {

            int n, m;

            //taking size of array a
            n = sc.nextInt();

            //taking size of array b
            m = sc.nextInt();

            //Creating 2 array of size n and m
            int[] a = new int[n];
            int[] b = new int[m];

            //inserting elements to array a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            //inserting elements to array b
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            //calling doUnion method and printing the results
            System.out.println(Solution10.doUnion(a, n, b, m));
        }
    }
}
// } Driver Code Ends

class Solution10 {
    public static int doUnion(int[] a, int n, int[] b, int m) {
        //Your code here
        int[] result = new int[n + m];
        System.arraycopy(a, 0, result, 0, n);
        System.arraycopy(b, 0, result, n, m);
        Arrays.sort(result);
        return removeDuplicateElements(result, n + m);
    }

    public static int removeDuplicateElements(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] tempA = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempA[j++] = arr[i];
            }
        }
        tempA[j++] = arr[n - 1];
        if (j >= 0) System.arraycopy(tempA, 0, arr, 0, j);
        return j;
    }
}
