package arrays.tasks;

//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task22 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while (t-- > 0) {
            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");

            //adding elements
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution22 obj = new Solution22();

            System.out.println(obj.maxSubArraySum(arr, n));
        }
    }
}

class Solution22 {
    long maxSubArraySum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        if (n == 2 && !(arr[0] > 0 && arr[1] > 0)) {
            return Math.max(arr[0], arr[1]);
        }
        long sum = 0L;
        long maxSum = Long.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
            sum = 0;
        }
        if (maxSum < arr[n - 1]) {
            maxSum = arr[n - 1];
        }
        return maxSum;
    }
}