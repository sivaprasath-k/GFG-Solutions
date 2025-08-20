class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rowsiz=mat.length,colsiz=0;
        for(int i=0;i<rowsiz;i++){
            int start=mat[i][0];
            colsiz=mat[i].length-1;
            int last=mat[i][colsiz];
            if(start<=x || last>=x){
                Arrays.sort(mat[i]);
                int left=0,right=colsiz,mid=0;
                while(left<=right){
                    mid=left+((right-left)/2);
                    if(mat[i][mid]>x) right=mid-1;
                    else if(mat[i][mid]<x) left=mid+1;
                    else return true;
                }
            }
        }
        return false;
    }
}