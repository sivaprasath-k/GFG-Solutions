class Solution {
    public int findMoves(int[] c, int[] p) {
        // code here
        Arrays.sort(c);
        Arrays.sort(p);
        int res=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>p[i]){
                res+=(c[i]-p[i]);
            }
            else{
                res+=(p[i]-c[i]);
            }
        }
        return res;
    }
}
