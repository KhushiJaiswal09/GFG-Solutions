//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        
        int sum=0;
        int length = String.valueOf(n).length();
        int b=n;
        
        for(int i=0; i<length; i++){
            
            int a=b%10;
            b=b/10;
            sum= sum + a*a*a;
            
        }
        
        if(sum == n){
            return "Yes";
        }else{
            return "No";
        }
    }
}