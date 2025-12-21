class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] q) {
        // code here
        int len=q.length,ans=0;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<len;i++){
            int left=q[i][0];
            int right=q[i][1];
            int num=q[i][2];
            ans=0;
            int first=leftoccur(left,right,num,arr);
            int sec=rightoccur(left,right,num,arr);
            if(first==-1) first=0;
            ans=sec-first+1;
            res.add(ans);
        }
        return res;
    }
    int leftoccur(int left,int right,int num,int[] arr){
        int count=-1;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(arr[mid]==num){
                count=mid;
                right=mid-1;
            }
            else if(arr[mid]<num) left=mid+1;
            else right=mid-1;
        }
        return count;
    }
    int rightoccur(int left,int right,int num,int[] arr){
        int count=-1;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(arr[mid]==num){
                count=mid;
                left=mid+1;
            }
            else if(arr[mid]<num) left=mid+1;
            else right=mid-1;
        }
        return count;
    }
}