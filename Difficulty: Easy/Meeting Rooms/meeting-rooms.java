class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        int len=arr.length,res=0;
        for(int i=0;i<len-1;i++){
            if(arr[i][1]>arr[i+1][0]) return false;
        }
        return true;
    }
}