//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int next=1;
        int max=Integer.MIN_VALUE;
        int j=0;
        int x=0;
        
        for(int i=0; i<n; i++){
            
            
            for (j=x; j<n; j++){
                next=next*arr[j];
                max=Math.max(max, next);
                //return max;
            }
           // return max;
            x++;
            next=1;
        }
        
        return max;
    }
}
//arr=-1, -3, -10, 0, 60