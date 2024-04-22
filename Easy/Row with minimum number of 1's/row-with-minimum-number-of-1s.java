//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.minRow(N, M, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count the number of 1s in an array
    int getOneCount(int[] arr) {
        int count = 0;
        for (int val : arr) {
            if (val == 1) {
                count++;
            }
        }
        return count;
    }

    // Function to find the row index with the minimum number of 1s
    int minRow(int n, int m, int[][] arr) {
        int count = m;
        int ind = 0;
        for (int i = 0; i < n; i++) {
            int currOneCount = getOneCount(arr[i]);
            if (currOneCount < count) {
                ind = i;
                count = currOneCount;
            }
        }
        // Adding 1 to the index to make it 1-based
        return ind + 1;
    }
}