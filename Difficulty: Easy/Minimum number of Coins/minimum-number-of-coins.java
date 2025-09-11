class Solution {
    public int findMin(int n) {
        // code here
        int[] arr={10,5,2,1};
        int i=0,ans=0;
        while(n!=0){
            if(arr[i]<=n){
                ans++;
                n=n-arr[i];
            }
            else i++;
        }
        return ans;
    }
}
