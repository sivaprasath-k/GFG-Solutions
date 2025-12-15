class Solution {
    public void swapDiagonal(int[][] mat) {
        // code here
        int size=mat.length;
        int half=size/2;
        for(int i=0;i<half;i++){
            int left=mat[i][i];
            int right=mat[i][(size-1-i)];
            mat[i][i]=right;
            mat[i][(size-1-i)]=left;
        }
        for(int i=size-1;i>=half;i--){
            if(size%2!=0 && i==half) break;
            else{
                int right=mat[i][i];
                int left=mat[i][(size-1-i)];
                mat[i][i]=left;
                mat[i][(size-1-i)]=right;
            }
        }
        return;
    }
}