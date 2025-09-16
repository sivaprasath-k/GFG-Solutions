// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int len=bt.length;
        int[] arr=new int[len];
        int sum=0;
        for(int i=0;i<len;i++){
            arr[i]=sum;
            sum+=bt[i];
        }
        int div=0;
        for(int i:arr) div+=i;
        int res=div/len;
        return res;
    }
}
