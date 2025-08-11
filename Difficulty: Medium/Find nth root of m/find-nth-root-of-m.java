class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int left=2,right=m,mid=0;
        while(left<=right){
            mid=left+((right-left)/2);
            int ans=(int)Math.pow(mid,n);
            if(ans>m) right=mid-1;
            else if(ans<m) left=mid+1;
            else return mid;
        }
        return -1;
    }
}