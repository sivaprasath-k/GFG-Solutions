class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int flag=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if((j>0 && mat[i][j]>=mat[i][j-1]) || j==0) flag++;
                if((j<mat[0].length-1 && mat[i][j]>=mat[i][j+1]) || 
j==mat[0].length-1) flag++;
                if((i>0 && mat[i][j]>=mat[i-1][j]) || i==0) flag++;
                if((i<mat.length-1 && mat[i][j]>=mat[i+1][j]) || 
                i==mat.length-1) flag++;
                if(flag==4){
                    res.add(i);
                    res.add(j);
                    break;
                }
                flag=0;
            }if(flag==4) break;
        }
        // System.out.println(res);
        return res;
    }
}