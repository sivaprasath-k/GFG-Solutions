class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        //Arrays.sort(arr);
        int len=arr.length-1;
        int left=1,right=0;
        for(int val:arr) right=Math.max(right,val);
        int ans=0;
        while(left<=right){
            int mid=left+((right-left)/2);
            int idx=0,res=0;
            while(idx<=len){
                int val=arr[idx]/mid;
                if(arr[idx]%mid!=0) val+=1;
                res+=val;
                if(res>k) break;
                idx++;
            }
            if(res<=k){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
            
        }
        return ans;
    }
}
