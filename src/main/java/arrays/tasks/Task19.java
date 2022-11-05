package arrays.tasks;

import java.util.HashMap;
import java.util.Scanner;

//{ Driver Code Starts
class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(Solution19.countSubArrWithEqualZeroAndOne(arr));
        }
    }
}

class Solution19 {
    static int countSubArrWithEqualZeroAndOne(int[] arr) {
        int hits = 0;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int val : arr) {
            if (val == 0)
                sum -= 1;
            else
                sum += 1;
            if (mp.containsKey(sum)) {
                hits += mp.get(sum);
                mp.put(sum, mp.get(sum) + 1);
            } else
                mp.put(sum, 1);

        }
        return hits;
    }
}