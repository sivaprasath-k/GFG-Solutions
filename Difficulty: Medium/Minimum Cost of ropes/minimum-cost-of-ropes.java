class Solution {
    public static int minCost(int[] arr) {
        // code here
        int len=arr.length,res=0;
        if(len==1) return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val:arr) pq.add(val);
        while(pq.size()>1){
            int val=pq.poll()+pq.poll();
            res+=val;
            pq.add(val);
        }
        return res;
    }
}