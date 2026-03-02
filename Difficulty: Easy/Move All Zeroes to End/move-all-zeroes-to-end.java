class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int len=arr.length;
        int[] res=new int[len];
        int idx=len-1,i=0;
        for(int val:arr){
            if(val==0){
                res[idx]=0;
                idx--;
            }
            else{
                res[i]=val;
                i++;}
        }
        for(i=0;i<len;i++) arr[i]=res[i]; 
    }
}