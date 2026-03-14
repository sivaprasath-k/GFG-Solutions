class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        int res=0,len=arr.length,i=0;
        Stack<Integer> st=new Stack<>();
        int[] nxt=new int[len];
        for(i=len-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            if(st.isEmpty()) nxt[i]=len;
            else nxt[i]=st.peek();
            st.push(i);
        }
        for(i=0;i<len;i++){
            res=res+(nxt[i]-i);
        }
        return res;
    }
}
