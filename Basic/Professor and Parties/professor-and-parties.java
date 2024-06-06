//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.PartyType(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {

    public static String PartyType( long a[], int n)
    {
        // Your code goes here
        Arrays.sort(a);
        String s="";
    
    if(n>1){
        for(int i=0; i<n-1; i++){
        
        if( a[i+1] == a[i]){
            s= "BOYS";
            break;
        }
        else{
         s= "GIRLS";   
        }
    }}
    else{
       
         s= "GIRLS";  
    }
    return s;
        
    }
}