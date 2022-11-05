package arrays.tasks;
/*
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence
are consecutive integers, the consecutive numbers can be in any order.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

class DriverClass {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            out.println(Solution25.findLongestConSeqSubSeq(a));
            t--;
        }
        out.flush();
    }

    static class FastReader {
        final BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        Integer nextInt() {
            return Integer.parseInt(next());
        }
    }
}

class Solution25 {
    static int findLongestConSeqSubSeq(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            hashSet.add(i);
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        int hits = 0;
        int maxHits = 0;
        for (int i = min; i < max + 1; i++) {
            if (hashSet.contains(i)) {
                hits++;
                if (maxHits < hits) {
                    maxHits = hits;
                }
            } else {
                hits = 0;
            }
        }
        return maxHits;
    }
}