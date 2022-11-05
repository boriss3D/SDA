package arrays.tasks;
/*
Given a random set of numbers, Print them in sorted order.
Your Task:
You don't need to read input or print anything. Your task is to complete the function sortArr() which takes the list
of integers and the size N as inputs and returns the modified list.
 */
//{ Driver Code Starts

import java.util.Arrays;
import java.util.Scanner;

class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }
            Solution04 obj = new Solution04();
            int[] ans = obj.sortArr(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

//User function Template for Java
class Solution04 {
    int[] sortArr(int[] arr, int n) {
        // code here
        int[] ints = Arrays.copyOf(arr, n);
        Arrays.sort(ints);
        return ints;
    }
}
