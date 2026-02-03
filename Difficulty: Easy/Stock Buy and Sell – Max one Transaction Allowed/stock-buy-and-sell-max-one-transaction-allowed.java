class Solution {
    public int maxProfit(int[] arr) {
        // Code here
        int len=arr.length;
        int[] arr2=new int[len];
        int max=arr[len-1];
        for(int i=len-1;i>=0;i--){
            arr2[i]=Math.max(max,arr[i]);
            max=Math.max(max,arr[i]);
        }
        max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            max=Math.max(max,arr2[i]-arr[i]);
        }
        return max;
    }
}