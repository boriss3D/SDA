package arrays.tasks;
/*
Given an array, rotate the array by one position in clock-wise direction.
 */
//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Compute11 obj = new Compute11();
            obj.rotate(a, n);

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < n; i++)
                output.append(a[i]).append(" ");
            System.out.println(output);
        }
    }
}

class Compute11 {
    public void rotate(int[] arr, int n) {
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, 0, n);
        if (temp.length - 1 >= 0) System.arraycopy(temp, 0, arr, 1, temp.length - 1);
        arr[0] = temp[n - 1];
    }
}
