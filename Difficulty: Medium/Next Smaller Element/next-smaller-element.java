class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        int j=0,flag=0;
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            int ans=st.isEmpty()?-1:st.peek();
            res.add(ans);
            st.add(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}