//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] S = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] result = obj.countOddEven(arr, n);
            for(Integer t:result)
            {
                System.out.print(t+" ");
            }
            System.out.println(" ");
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[] countOddEven(int[] arr, int n)
    {
        // Code here
        int odd = 0;
        int even = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }
        
        int [] count = new int[2];
        count[0]=odd;
        count[1]=even;
        
        return count;
        
    }
}