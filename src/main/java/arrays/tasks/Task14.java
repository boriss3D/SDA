package arrays.tasks;
/*
Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more
than once in the given array.
 */
//{ Driver Code Starts

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            ArrayList<Integer> ans = Solution14.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends
class Solution14 {
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(arr);
        arrayList.add(-1);
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1] && count == 0) {
                if (arrayList.get(0) == -1) {
                    arrayList.clear();
                }
                arrayList.add(arr[i]);
                count++;
            }
            if (arr[i] != arr[i + 1]) {
                count = 0;
            }
        }
        return arrayList;
    }
}

