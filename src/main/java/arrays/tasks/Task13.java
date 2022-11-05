package arrays.tasks;
/*
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal
to K.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution13().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

class Solution13 {
    int getPairsCount(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int hits = 0;
        int result;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[n - 1] < k) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                result = arr[i] + arr[j];
                if (result < k) {
                    continue;
                }
                if (result == k) {
                    hits++;
                }
                if (result > k) {
                    break;
                }
            }
        }
        return hits;
    }
}