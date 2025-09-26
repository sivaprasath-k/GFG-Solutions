class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        if(type==1){
            while(k!=0){
                int val=dq.removeLast();
                dq.addFirst(val);
                k--;
            }
        }
        else{
            while(k!=0){
                int val=dq.removeFirst();
                dq.addLast(val);
                k--;
            }
        }
    }
}