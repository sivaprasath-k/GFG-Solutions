class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int left=0,right=arr.length-1,mid=0,ans=-1;
        while(left<=right){
            mid=left+((right-left)/2);
            if(arr[mid]<target) left=mid+1;
            else if(arr[mid]>target){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        if(ans==-1) return arr.length;
        return ans;
    }
}
