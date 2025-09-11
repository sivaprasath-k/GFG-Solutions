class Solution {
    public int minJumps(int[] arr) {
        // code here
         int jump=0,cend=0,far=0,val=0;
         int len=arr.length-1;
         if(len>1 && arr[0]==0) return -1;
         for(int i=0;i<arr.length-1;i++){
             val=i+arr[i];
             far=Math.max(far,val);
             if(far>=len) return jump+1;
             if(i==cend){
                 jump++;
                 if(far<=cend) return -1;
                 cend=far;
                 if(far>=len) return jump;
             }
         }
         return jump;
    }
}