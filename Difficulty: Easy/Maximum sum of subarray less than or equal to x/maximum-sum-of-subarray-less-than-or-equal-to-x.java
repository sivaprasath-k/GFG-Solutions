//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            long sum = Long.parseLong(br.readLine());
            Solution ob = new Solution();
            long ans = ob.findMaxSubarraySum(arr, sum);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long findMaxSubarraySum(int[] arr, long x) {
        // Your code goes here
        int a=arr.length;
        int high=0,low=0;
        int sum=0,res=0,k=1;
        while(high<a){
            if(k==1){
                sum+=arr[high];
            }
            if(sum<=x){
                res=Math.max(res,sum);
                if(arr[high]<=x){
                 res=Math.max(res,arr[high]);   
                }
                k=1;
                high++;
            }
            else{
                sum-=arr[low];
                k=0;
                low++;
            }
        }
        return res;
    }
}
