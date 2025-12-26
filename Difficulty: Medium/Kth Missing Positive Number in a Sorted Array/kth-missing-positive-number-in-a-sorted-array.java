class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int left=0,mid=0,right=arr.length-1,idx=0,num=0,res=0;
        while(left<=right){
            mid=left+((right-left)/2);
            num=arr[mid]-mid-1;
            if(num==k){
                res=arr[mid]-1;
                right=mid-1;
            }
            else if(num<k){
                res=arr[mid]+(k-num);
                left=mid+1;
            }
            else{
                res=(num-k)+1;
                res=arr[mid]-res;
                right=mid-1;
            }
        }
        return res;
    }
}