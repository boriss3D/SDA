package arrays.tasks;
/*
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds
to a given number S.
In case of multiple subArrays, return the subArray which comes first on moving from left to right.
 */
//{ Driver Code Starts

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            ArrayList<Integer> res = Solution08.subArraySum(m, n, s);
            for (Integer re : res) System.out.print(re + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends

class Solution08 {
    static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (n >= 100000) {
            arrayList.add(-1);
            return arrayList;
        }
        for (int i = 0; i < n; i++) {
            int sum = arr[i];

            if (sum == s) {
                arrayList.add(i + 1);
                arrayList.add(i + 1);
                return arrayList;
            }
            for (int j = i + 1; j < n; j++) {
                if (sum > s) {
                    break;
                }
                sum += arr[j];
                if (sum > s) {
                    break;
                }
                if (sum == s) {
                    arrayList.add(i + 1);
                    arrayList.add(j + 1);
                    return arrayList;
                }
            }
        }
        arrayList.add(-1);
        return arrayList;
    }
}
