class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mices.length;i++){
            int check=Math.abs(holes[i]-mices[i]);
            max=Math.max(check,max);
        }
        return max;
    }
};