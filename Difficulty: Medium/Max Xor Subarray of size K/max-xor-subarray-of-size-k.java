class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int val=0,sum=0,st=0;
        for(int i=0;i<k;i++) sum^=arr[i];
        val=sum;
        for(int i=k;i<arr.length;i++){
            sum^=arr[i-k];
            sum^=arr[i];
            val=Math.max(val,sum);
        }
        return val;
    }
}
