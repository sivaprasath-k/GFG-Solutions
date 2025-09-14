class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
        int len=gas.length,sidx=0;
        int run=gas[0];
        for(int i=1;i<len*2;i++){
            int idx=i%len;
            int pidx=(i-1)%len;
            run-=cost[pidx];
            if(idx==sidx && run==0) break;
            if(run>=0) run+=gas[idx];
            else{
                run=0;
                run+=gas[idx];
                sidx=idx;
                if(i>=len) return -1;
            }
        }
        return sidx;
    }
}