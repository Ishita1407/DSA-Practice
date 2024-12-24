//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int matrix[][] = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();

            Solution x = new Solution();

            if (x.searchMatrix(matrix, target))
                System.out.println("true");
            else
                System.out.println("false");
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
  
    public boolean searchMatrix(int[][] mat, int x) {
        
        int size=mat[0].length;
        int low=0,high=size*mat.length-1;
        int i=0,j=0;
        while(low<=high){
           int mid=(low+high)/2;
           i=mid/size;
           j=mid%size;
           if(mat[i][j]==x) return true;
           else if(mat[i][j]>x) high=mid-1;
           else low=mid+1;
           
        }
        return false;
    }
}