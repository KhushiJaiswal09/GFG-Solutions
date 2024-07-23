//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        StringBuilder sb = new StringBuilder();
        for (int e : a) sb.append(e + " ");
        System.out.println(sb);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[1]);

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(arr, n, s);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends








class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int left= 0,right=0;
       ArrayList<Integer> result = new ArrayList();
       if(arr.length==0)return result;
        int sum = arr[0];
        
        while(left<=right){
            if(sum==s){
                result.add(left+1);
                result.add(right+1);
                return result;
            }else{
               // System.out.println("not same");
               if(right==arr.length+1){
                    result.add(-1);
                    return result;
               }
               if(sum<s){
                     right++;
                     if(right>=0 && right<arr.length){
                     sum+=arr[right];
                }
               }
                else if(sum>s){
                    sum-=arr[left++];
                }
               }
               //System.out.println(left +"==> " + right +"sum " + sum);
               if(left==right+1 && left<arr.length){
                  right = left;
                  sum = arr[left];
               }
            }
          
        
        result.add(-1);
        return result;
    }
}