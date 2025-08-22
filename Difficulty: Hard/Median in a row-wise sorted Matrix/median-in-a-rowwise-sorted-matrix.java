class Solution {
    public int median(int[][] mat) {
        // code here
        // Arrays.sort(mat);
        // System.out.print(mat);
        // return 5;
        int row=mat.length,column=mat[0].length;
        int[] arr=new int[row*column];
        int ind=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[ind++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        int mid=(row*column)/2;
        return arr[mid];
    }
}