package arrays.tasks;
/*
Given an array A of size N, print the reverse of it.
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines
of input. First line contains N the size of the array A. The second line contains the elements of the array.
Output:
For each testcase, in a new line, print the array in reverse order.
 */

import java.util.Scanner;

class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            int[] ints = new int[n];

            for (int i = 0; i < ints.length; i++) {
                ints[i] = scanner.nextInt();
            }

            for (int i = n - 1; i >= 0; i--) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
            t--;
        }
        scanner.close();
    }
}
