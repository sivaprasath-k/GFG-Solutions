// User function Template for Java

class Solution {
    static int pageFaults(int n, int c, int p[]) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        int res=0;
        for(int val:p){
            if(q.contains(val)){
                q.remove(val);
                q.add(val);
            }
            else{
                q.add(val);
                res++;
            }
            if(q.size()>c) q.remove();
        }
        return res;
    }
}