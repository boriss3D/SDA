package arrays.tasks;
/*
Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the
picked pivot. Given an array arr[], its starting position is low (the index of the array) and its ending position
is high(the index of the array).
 */

import java.util.Scanner;

class Sorting {
    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Solution15.quickSort(arr, 0, n - 1);
            printArray(arr);
            T--;
        }
    }
}
// } Driver Code Ends

class Solution15 {
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int[] arr, int low, int high) {
        // code here
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        // your code here
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

