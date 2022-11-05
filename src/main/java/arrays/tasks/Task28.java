package arrays.tasks;
/*
Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms
required for the railway station so that no train is kept waiting. Consider that all the trains arrive at the same day
and leave on the same day. Arrival and departure time can never be the same for a train, but we can have arrival time
of one train equal to departure time of the other. At any given instance of time, same platform can not be used
for both departure of a train and arrival of another train. In such cases, we need different platforms.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task28 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);

            int[] arr = new int[n];
            int[] dep = new int[n];

            str = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);

            System.out.println(Solution28.findPlatform(arr, dep, n));
        }
    }
}

class Solution28 {
    static int findPlatform(int[] arr, int[] dep, int n) {
        // add your code here
        int conflict;
        int arrival = 0;
        int departure = 0;
        int arrivalIndex = 0;
        int departureIndex = 0;
        int max = 0;
        for (int i = 0; i < 2400; i++) {
            if (i == arr[arrivalIndex]) {
                arrival++;
                if (arrivalIndex < n - 1) {
                    arrivalIndex++;
                }
            }
            if (i == dep[departureIndex]) {
                departure++;
                if (departureIndex < n - 1) {
                    departureIndex++;
                }
            }
            conflict = arrival - departure - 1;
            max = Math.max(max, conflict);
        }
        return max;
    }
}


