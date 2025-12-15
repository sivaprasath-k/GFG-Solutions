class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> res=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
        int ans=0;
        for(int i=0;i<k;i++){
            ans=res.poll();
        }
        return ans;
    }
}