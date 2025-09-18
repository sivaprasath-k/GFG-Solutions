class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
         Stack<Integer> st=new Stack<>();
         int size=(2*arr.length)-1;
         int len=arr.length;
         int[] q=new int[len];
         for(int i=size;i>=0;i--){
             int in=i%len;
             while(!st.isEmpty()){
                 if(st.peek()>arr[in]){
                     q[in]=st.peek();
                     break;
                 }
                 else{
                    st.pop(); 
                 }
             }
             st.add(arr[in]);
             if(i<len && st.isEmpty()){
                 break;
             }
         }
         ArrayList<Integer> a=new ArrayList<>();
         for(int i=0;i<len;i++){
             if(q[i]==0){
                 a.add(-1);
             }
             else a.add(q[i]);
         }
         return a;
    }
}