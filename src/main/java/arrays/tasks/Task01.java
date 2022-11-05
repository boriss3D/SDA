package arrays.tasks;

import java.util.Scanner;

/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exist).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise, output will be 0.
Input:
1
3
1 2 3
Output:
1
 */

class PeakElement { // Driver Code Starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] tmp = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                tmp[i] = a[i];
            }
            int f = 0;
            int A = (new Task01()).peakElement(tmp, n);

            if (n == 1 && A == 0)
                f = 1;
            else if (A == 0 && a[0] >= a[1])
                f = 1;
            else if (A == n - 1 && a[n - 1] >= a[n - 2])
                f = 1;
            else if (A >= 0 && A < n && a[A] >= a[A + 1] && a[A] >= a[A - 1])
                f = 1;
            System.out.println(f);
        }
    }
} // Driver Code Ends
/*Complete the function below*/

class Task01 {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}
