class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int a=arr.length,i=0,t=0;
        int[] b=new int[a];
        for(char q:arr){
            if(q=='P'){
                b[i]=1;
            }
            else{
                b[i]=-1;
                t++;
            }
            i++;
        }
        i=0;
        int j=1,m=0;
        while(i<a && j<a){
            if(b[i]!=b[j] && Math.abs(j-i)<=k && b[i]!=0 && b[j]!=0){
                b[i]=0;
                b[j]=0;
                m++;
                i++;
                j++;
            }
            else if(b[i]==0 || Math.abs(j-i)>k){
                i++;
            }
            else if(b[j]==0 || b[i]==b[j]){
                j++;
            }
        }
        return m;
    }
}