package arrays.tasks;
/*
Given an array Arr[] that contains N integers (maybe positive, negative or zero). Find the product of the maximum
product sub array.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task24 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution24().maxProduct(arr, n));
        }
    }
}

class Solution24 {
    long maxProduct(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        long product = 1L;
        long maxProduct = Long.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                product *= arr[j];
                if (maxProduct < product) {
                    maxProduct = product;
                }
            }
            product = 1L;
        }
        if (maxProduct < arr[n - 1]) {
            maxProduct = arr[n - 1];
        }
        return maxProduct;
    }
}