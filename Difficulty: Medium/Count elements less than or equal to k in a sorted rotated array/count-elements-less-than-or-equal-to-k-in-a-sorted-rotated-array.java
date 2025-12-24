class Solution {
    public int countLessEqual(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int len=arr.length,left=0,right=len-1;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(arr[mid]<=x) left=mid+1;
            else right=mid-1;
        }
        return right+1;
    }
}
