package arrays.tasks;
/*
Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth the smallest
element in the given array. It is given that all array elements are distinct.
Your Task:
You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes
the array arr[], integers l and r denoting the starting and ending index of the array and an integer K as input and
returns the Kth the smallest element.
 */
//{ Driver Code Starts

import java.io.PrintWriter;
import java.util.Scanner;

class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            out.println(Solution05.kthSmallest(arr, 0, n - 1, k));
        }
        out.flush();
    }
}

// } Driver Code Ends
class Solution05 {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        //Your code here
        quickSort(arr, l, r);
        return arr[k - 1];
    }

    public static void quickSort(int[] arr, int start, int end) {

        int partition = partition(arr, start, end);

        if (partition - 1 > start) {
            quickSort(arr, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
}

