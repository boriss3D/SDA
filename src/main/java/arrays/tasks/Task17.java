package arrays.tasks;
/*
Your Task:
You don't need to read input or print anything. Complete the function firstRepeated() which takes arr and n as input
parameters and return the position of the first repeating element. If there is no such element, return -1.
The position you return should be according to 1-based indexing.
Input:
1
7
1 5 3 4 3 5 6
Output:
2
 */
// Driver Code Starts

import java.util.Arrays;
import java.util.Scanner;

class Task17 {
    public static void main(String[] args) {
        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        // Taking total count of testcases
        int t = sc.nextInt();
        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();
            // creating a new array of size n
            int[] arr = new int[n];
            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // calling firstRepeated method
            // and printing the result
            System.out.println(Solution17.firstRepeated(arr, n));
        }
    }
}

// Driver Code Ends
// User function Template for Java
class Solution17 {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return -1;
        }
        int minIndex = Integer.MAX_VALUE;
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, 0, n);
        Arrays.sort(temp);
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == temp[i]) {
                        if (minIndex > j) {
                            minIndex = j;
                        }
                    }
                }
            }
        }
        if (minIndex == Integer.MAX_VALUE)
            return -1;
        else
            return minIndex + 1;
    }
}

