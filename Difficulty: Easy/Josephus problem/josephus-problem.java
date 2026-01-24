class Solution {
    public int josephus(int n, int k) {
        // code here
        List<Integer> res=new ArrayList<>();
        int preidx=0,idx=0;
        for(int i=1;i<=n;i++) res.add(i);
        while(res.size()>1){
            idx=(preidx+k-1)%res.size();
            res.remove(idx);
            preidx=idx;
        }
        int ans=res.get(0);
        return ans;
    }
}