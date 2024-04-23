//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int firstElement(int n) {
        // code here
        long prev1 = 1, prev2 = 0, mod = (long)1e9+7;
        while(n-->1){
            long curr = (prev1 + prev2)%mod;
            prev2 = prev1;
            prev1 = curr;
        }
        return (int)prev1;
}
}