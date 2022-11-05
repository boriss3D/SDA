package arrays.tasks;
/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
Input:
1
6
3 2 1 56 1000 167
Output:
1 1000
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long[] a = new long[(int) (n)];

            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Pair product = Compute.getMinMax(a, n);
            System.out.println(product.first + " " + product.second);

        }
    }
} // Driver Code Ends

class Compute {
    static Pair getMinMax(long[] a, long n) {
        //Write your code here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        return new Pair(min, max);
    }
}
