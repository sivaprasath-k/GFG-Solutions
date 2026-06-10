class Solution {
    public boolean canSeatAllPeople(int k, int[] arr) {
        // code here
       int len=arr.length,cnt=0;
       if((len==1) && (arr[0]==1 && k==1)) return false;
       else if(len==1) return true;
       for(int i=0;i<len;i++){
           if(arr[i]==1){
               if((i==0 && arr[i+1]!=0) || (i==len-1 && arr[len-2]!=0)) return false;
               else if((i!=0 && i!=len-1) && (arr[i-1]!=0 || arr[i+1]!=0)) return false; 
           }
           else{
              if(i==0 && arr[i+1]==0){
                  cnt++;
                  arr[i]=1;
              }
              else if(i==len-1 && arr[len-2]==0) cnt++;
              else if((i!=0 && i!=len-1) && arr[i-1]==0 && arr[i+1]==0){
                  cnt++;
                  arr[i]=1;
              }
           }
       }
       if(cnt>=k) return true;
       return false;
    }
}