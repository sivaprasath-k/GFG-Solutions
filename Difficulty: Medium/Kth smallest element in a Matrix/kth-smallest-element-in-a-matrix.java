class Solution {
    public int kthSmallest(int[][] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int flag=0,len=arr.length;
        int row=0,col=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++) pq.add(arr[i][j]);
        }
        int res=0,ans=0;
        while(pq.size()!=0){
            ans=pq.poll();
            res++;
            if(res==k) return ans;
        }
        return ans;
    }
}
