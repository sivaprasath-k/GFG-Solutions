class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int size=mat.length;
        for(int i=0;i<size;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<size;j++){
                // int st=mat[i][j];
                // mat[i][j]=mat[j][i];
                // mat[j][i]=st;
                row.add(mat[j][i]);
            }
            res.add(row);
        }
        return res;
    }
}