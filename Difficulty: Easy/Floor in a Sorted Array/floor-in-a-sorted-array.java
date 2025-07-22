class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int num=0,flag=0;
        int max=0;
        for(int i:arr){
            if(i<=x){
                if(i>max) max=i;
                flag=1;
            }
        }
        if(flag==0) return -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==max) return i;
        }
        return 1;
    }
}
