class Solution {
    public int minOperations(int[] arr) {
        // code here
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        double sum=0;
        for(int val:arr){
            pq.add((double)val);
            sum+=val;
        }
        double half=(double)sum/2.0;
        int res=0;
        while(sum>half){
            double mh=(double)pq.poll()/2.0;
            sum-=mh;
            pq.add(mh);
            res++;
        }
        return res;
    }
}