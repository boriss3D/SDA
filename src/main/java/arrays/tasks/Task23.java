package arrays.tasks;
/*
Given an integer N, find its factorial.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> ans = Solution23.factorial(N);
            for (Integer val : ans)
                System.out.print(val);
            System.out.println();
        }
    }
}

class Solution23 {
    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        java.math.BigInteger bigInteger = new java.math.BigInteger(String.valueOf(1));
        for (int i = 1; i <= N; i++) {
            bigInteger = bigInteger.multiply(new java.math.BigInteger(String.valueOf(i)));
        }
        String bigNumber = bigInteger.toString();
        for (int i = 0; i < bigNumber.length(); i++) {
            arrayList.add(Integer.parseInt(bigNumber.substring(i, i + 1)));
        }
        return arrayList;
    }
}
