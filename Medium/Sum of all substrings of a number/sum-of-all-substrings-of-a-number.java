//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    //taking the String
		    String s=sc.nextLine();
		    Solution ob = new Solution();
		    //calling method sumSubstrings() 
		    System.out.println(ob.sumSubstrings(s));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long sumSubstrings(String s)
    {
        long mod = 1000000007;
        int pos=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==0){
                pos=i;
            }else{
                break;
            }
        }
        
        s = s.substring(pos,s.length());//ignore leading zeros.Ex : 0000012334
        
        long dp[] = new long[s.length()];
        dp[0] = s.charAt(0)-'0';
        long sum = dp[0];
        for(int i=1;i<s.length();i++){
            long temp = s.charAt(i)-'0';
            dp[i] = (i+1)*temp + (10*dp[i-1])%mod;

            sum+=dp[i];
            sum = sum%mod;
        }
        return sum;

    }
}