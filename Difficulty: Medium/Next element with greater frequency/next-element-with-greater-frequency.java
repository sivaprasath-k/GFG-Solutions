class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        int len=arr.length,flag=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        int i=len-1;
        while(i>=0){
            int fq=map.get(arr[i]);
            while(!st.isEmpty() && fq>=map.get(st.peek())){
                st.pop();
            }
            if(st.isEmpty()) res.add(-1);
            else res.add(st.peek());
            st.add(arr[i]);
            i--;
        }
        Collections.reverse(res);
        return res;
    }
}

// class Solution {
//     public ArrayList<Integer> nextFreqGreater(int[] arr) {
//         // code here
//         int len=arr.length,flag=0;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int val:arr){
//             map.put(val,map.getOrDefault(val,0)+1);
//         }
//         ArrayList<Integer> res=new ArrayList<>();
//         for(int i=0;i<len;i++){
//             int fre=map.get(arr[i]);
//             for(int j=i+1;j<len;j++){
//                 if(map.get(arr[j])>fre){
//                     res.add(arr[j]);
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0) res.add(-1);
//             flag=0;
//         }
//         return res;
//     }
// }