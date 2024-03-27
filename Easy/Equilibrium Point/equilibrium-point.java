//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends



class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
   long presum= 0   ,postsum=0;
   int count =0 ,i=0,j=n-1;
    if(n==2 &&( arr[i]==0 ||arr[n-1]==0)){
        return 1;
    }
    while(i<=j){
        if(presum==postsum){
            if(count ==n-1)
            return i+1;
            else{
            presum+=arr[i];
            postsum+= arr[j];
            i++;
           j--;
            count=count+2;
            }
        }
       else if(presum<postsum){
            presum+=arr[i];
            i++;
            count ++;
        }
        else{
            postsum+=arr[j];
            j--;
            count++;
        }
            
        
    }
    return -1;
    }
}