class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n=arr.length,max=Integer.MIN_VALUE;;
        int it=0,i=0,j=0;
        while(true){
            if(arr[j]==0) it++;
            if(it<=k) max=Math.max(max,(j-(i-1)));
            else{
                while(it>k){
                    if(arr[i]==0){
                        it--;
                    }
                    i++;
                }
                max=Math.max(max,(j-(i-1)));
            }
            j++;
            if(j==n) break;
        }
        return max;
    }
}
        // int max=Integer.MIN_VALUE;
        // int it=0,i=0,j=0;
        // while(true){
        //     if(it>k){
        //         while(it>k){
        //             if(arr[i]==0){
        //                 it--;
        //             }
        //             i++;
        //         }
        //         int val=j-(i-1);
        //         max=Math.max(max,val);
        //         j++;
        //     }
        //     else{
        //         if(j<n && arr[j]==0) it++;
        //         if(it<=k){
        //             int val=j-(i-1);
        //             max=Math.max(max,val);
        //             j++;
        //         }
        //         if(j>=n) break;
        //     }
        // }
        // return max;