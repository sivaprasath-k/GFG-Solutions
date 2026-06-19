class Solution {
    public int findCoverage(int[][] mat) {
        // code here
        int row=mat.length,col=mat[0].length;
        int i=0,j=0,res=0,idx=0;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(mat[i][j]==0){
                    idx=i-1;
                    while(idx>0 && mat[idx][j]==0) idx--;
                    if(idx>=0 && mat[idx][j]==1) res++;
                    idx=i+1;
                    while(idx<row-1 && mat[idx][j]==0) idx++;
                    if(idx<=row-1 && mat[idx][j]==1) res++;
                    idx=j-1;
                    while(idx>0 && mat[i][idx]==0) idx--;
                    if(idx>=0 && mat[i][idx]==1) res++;
                    idx=j+1;
                    while(idx<col-1 && mat[i][idx]==0) idx++;
                    if(idx<=col-1 && mat[i][idx]==1) res++;
                }
            }
        }
        return res;
    }
}