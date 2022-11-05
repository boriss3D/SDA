package arrays.tasks;
/*
Your Task:
Your task is to complete the function findFrequency() which should count the frequency of X and return it.
Input:
N = 5
vector = {1, 1, 1, 1, 1}
X = 1
Output:
5
Explanation: Frequency of 1 is 5.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//{ Driver Code Starts
class FastReader {
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

class GFG {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            Task06 ob = new Task06();
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // element whose frequency to be found
            int x = sc.nextInt();
            out.println(ob.findFrequency(A, x));
        }
        out.flush();
    }
}

// } Driver Code Ends
class Task06 {
    int findFrequency(int[] A, int x) {
        int frequency = 0;
        for (int j : A) {
            if (j == x) {
                frequency++;
            }
        }
        return frequency;
    }
}