
class Solution {
    public static int[] count_NGE(int arr[], int in[]) {
        // code here
        int len=arr.length;
        int[] res=new int[in.length];
        for(int i=0;i<in.length;i++){
            int idx=in[i];
            int sum=0;
            for(int j=idx+1;j<len;j++){
                if(arr[idx]<arr[j]) sum++;
            }
            res[i]=sum;
        }
        return res;
    }
}
