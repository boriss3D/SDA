package arrays.tasks;
/*
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//{ Driver Code Starts
class Task18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            String line = br.readLine();
            String[] elements = line.trim().split(" ");

            for (int index = 0; index < n; index++) {
                arr[index] = Integer.parseInt(elements[index]);
            }

            Check obj = new Check();

            System.out.println(obj.firstNonRepeating(arr, n));
        }
    }
}

// } Driver Code Ends
//User function Template for Java
class Check {
    public int firstNonRepeating(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int minIndex = Integer.MAX_VALUE;
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, 0, n);
        Arrays.sort(temp);
        if (temp[0] != temp[1]) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp[0]) {
                    minIndex = j;
                    break;
                }
            }
        }
        if (temp[n - 2] != temp[n - 1]) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp[n - 1]) {
                    if (minIndex > j) {
                        minIndex = j;
                    }
                    break;
                }
            }
        }
        for (int i = 1; i < temp.length - 1; i++) {
            if (temp[i] != temp[i + 1] && temp[i] != temp[i - 1]) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == temp[i]) {
                        if (minIndex > j) {
                            minIndex = j;
                        }
                        break;
                    }
                }
            }
        }
        if (minIndex == Integer.MAX_VALUE)
            return 0;
        else
            return arr[minIndex];
    }
}


