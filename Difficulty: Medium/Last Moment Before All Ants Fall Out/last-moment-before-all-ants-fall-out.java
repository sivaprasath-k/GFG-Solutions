class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int val:left) max=Math.max(max,val);
        for(int val:right) min=Math.min(min,val);
        min=n-min;
        int ans=Math.max(max,min);
        return ans;
    }
}