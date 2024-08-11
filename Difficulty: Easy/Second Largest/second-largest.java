//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        int max=0;
        int n=arr.size();
        for(int i=0; i<n; i++){
            max=Math.max(max, arr.get(i));
        }
        
        for(int i=0; i<n; i++){
            int count=0;
            if(max==arr.get(i)){
                count++;
                arr.set(i, 0);
            }
            
            if (count==2)      return -1;
        }
        
        max=0;
        for(int i=0; i<n; i++){
            max=Math.max(max, arr.get(i));
        }
        
        return max;
        
    }
}