class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val:a) hs.add(val);
        for(int i=0;i<b.length;i++){
            if(i==0 || b[i]!=b[i-1]){
                if(hs.contains(b[i])) pq.add(b[i]);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:pq) res.add(i);
        return res;
    }
}