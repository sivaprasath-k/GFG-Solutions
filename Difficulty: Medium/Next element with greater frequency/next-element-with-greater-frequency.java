class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()){
                int x=st.peek();
                if(map.get(x)>map.get(arr[i])){
                    a.add(x);
                    break;
                }
                else{
                    st.pop();
                }
            }
            if(st.isEmpty()){
                a.add(-1);
            }
            st.push(arr[i]);
        }
        Collections.reverse(a);
        return a;
    }
}