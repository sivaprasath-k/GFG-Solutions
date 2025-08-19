class Solution {
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        ArrayList<Integer> ans=new ArrayList<>();
        int left=0,right=arr.length-1,mid=0;
        int in=-1;
        int[] suf=new int[arr.length];
        suf[arr.length-1]=arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            if(arr[j]>suf[j+1]) suf[j]=suf[j+1];
            else suf[j]=arr[j];
        }
        for(int i=0;i<arr.length;i++){
            left=i+1;
            right=arr.length-1;
            in=-1;
            while(right>i && left<=right){
                mid=left+((right-left)/2);
                if(suf[mid]<arr[i]){
                    in=mid;
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            ans.add(in);
        }
        return ans;
    }
}
 