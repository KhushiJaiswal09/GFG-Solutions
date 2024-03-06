//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfDigits(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
static int sumOfDigits(int N) {
        // code here

        int length = String.valueOf(N).length();
        int sum=0;
       
        for(int i=0; i<length; i++){
            int a=N%10;
            N=N/10;
            sum=sum+a;
        }
        return sum;
    }
}
       