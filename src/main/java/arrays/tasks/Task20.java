package arrays.tasks;
/*
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive
and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number.
 */
//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task20 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution20().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

//User function Template for Java
class Solution20 {
    void rearrange(int[] arr, int n) {

        int negativeIndex = 0;
        int positiveIndex = 0;
        for (int i : arr) {
            if (i < 0) {
                negativeIndex++;
            } else {
                positiveIndex++;
            }
        }
        int[] negative = new int[negativeIndex];
        int[] positive = new int[positiveIndex];
        negativeIndex = 0;
        positiveIndex = 0;
        for (int i : arr) {
            if (i < 0) {
                negative[negativeIndex] = i;
                negativeIndex++;
            } else {
                positive[positiveIndex] = i;
                positiveIndex++;
            }
        }

        int index = 0;
        if (positiveIndex <= negativeIndex) {
            for (int i = 0; i < positiveIndex * 2; i += 2) {
                arr[i] = positive[index++];
            }
            index = 0;
            for (int i = 1; i < positiveIndex * 2; i += 2) {
                arr[i] = negative[index++];
            }
            for (int i = index * 2; i < n; i++) {
                arr[i] = negative[index++];
            }
        }

        if (positiveIndex > negativeIndex) {
            for (int i = 1; i < negativeIndex * 2; i += 2) {
                arr[i] = negative[index++];
            }
            index = 0;
            for (int i = 0; i < negativeIndex * 2; i += 2) {
                arr[i] = positive[index++];
            }
            for (int i = index * 2; i < n; i++) {
                arr[i] = positive[index++];
            }
        }
    }
}
