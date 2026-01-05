class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0,high=k-1,sum=0,maxsum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxsum=Math.max(maxsum,sum);
        int a=arr.length;
        while(high<a-1){
            sum-=arr[low];
            low++;
            high++;
            sum+=arr[high];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}