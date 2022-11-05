package arrays.tasks;
/*
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
Your Task:
You don't need to read input or print anything. Your task is to complete the function commonElements() which take
the 3 arrays A[], B[], C[] and their respective sizes n1, n2 and n3 as inputs and returns an array containing
the common element present in all the 3 arrays in sorted order.
If there are no such elements return an empty array. In this case the output will be printed as -1.
Input:
1
6 5 8
1 5 10 20 40 80
6 7 20 80 100
3 4 15 20 30 70 80 120
Output:
20 80
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//{ Driver Code Starts
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            int[] A = new int[n1];
            int[] B = new int[n2];
            int[] C = new int[n3];

            for (int i = 0; i < n1; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n2; i++) {
                B[i] = sc.nextInt();
            }
            for (int i = 0; i < n3; i++) {
                C[i] = sc.nextInt();
            }

            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0) {
                System.out.print(-1);
            } else {
                for (Integer re : res) {
                    System.out.print(re + " ");
                }
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


// User Solution
class Solution {
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

    ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        // code here
        n1 = removeDuplicateElements(A, n1);
        n2 = removeDuplicateElements(B, n2);
        n3 = removeDuplicateElements(C, n3);

        ArrayList<Integer> arrayList = new ArrayList<>();

        int[] temp = new int[n1 + n2 + n3];
        System.arraycopy(A, 0, temp, 0, n1);
        System.arraycopy(B, 0, temp, n1, n2);
        System.arraycopy(C, 0, temp, n1 + n2, n3);
        Arrays.sort(temp);

        for (int i = 0; i < temp.length - 2; i++) {
            if (temp[i] == temp[i + 1] && temp[i + 1] == temp[i + 2]) {
                if (!arrayList.contains(temp[i])) {
                    arrayList.add(temp[i]);
                }
            }
        }

        if (arrayList.size() == 0) {
            arrayList.add(-1);
        }
        return arrayList;
    }
}
// User Solution ends