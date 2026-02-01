class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        //if(k==1) return Arrays.asList(arr);
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        int idx=0;
        res.add(pq.peek());
        pq.remove(arr[idx]);
        idx++;
        for(int i=k;i<arr.length;i++){
            pq.add(arr[i]);
            res.add(pq.peek());
            pq.remove(arr[idx]);
            idx++;
        }
        return res;
    }
}