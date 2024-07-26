//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends

class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        int[] result = new int[2];
        
        // Calculate the sum and sum of squares of first n natural numbers
        long sumN = (long) n * (n + 1) / 2;
        long sumN2 = (long) n * (n + 1) * (2 * n + 1) / 6;

        long sum = 0, sumSq = 0;
        
        // Calculate the sum and sum of squares of the array elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sumSq += (long) arr[i] * arr[i];
        }

        // Calculate the differences
        long diffSum = sumN - sum; // x - y
        long diffSumSq = sumN2 - sumSq; // x^2 - y^2

        // Using the formulas:
        // x - y = diffSum
        // x^2 - y^2 = diffSumSq = (x + y)(x - y)
        // So, (x + y) = diffSumSq / diffSum

        long sumXY = diffSumSq / diffSum; // x + y

        // Now we can solve for x and y
        long x = (diffSum + sumXY) / 2;
        long y = x - diffSum;

        result[1] = (int) x; // missing number
        result[0] = (int) y; // repeated number

        return result;
    }
}
