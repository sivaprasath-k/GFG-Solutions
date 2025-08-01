class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int left=0,right=arr.length-1,mid=left+((right-left)/2);
        int ans=arr.length;
        while(left<=right){
            mid=left+((right-left)/2);
            if(arr[mid]== target){
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]>target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
