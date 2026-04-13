class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int len=arr.length,min=arr[0],max=arr[len-1];
        int[] sm=new int[len];
        int[] gr=new int[len];
        sm[0]=-1;
        st.add(arr[0]);
        
        for(int i=1;i<len;i++){
            min=Math.min(min,arr[i]);
            if(min==arr[i]) sm[i]=-1;
            else sm[i]=min;
        }
        st=new Stack<>();
        gr[len-1]=-1;
        st.add(arr[len-1]);
        for(int i=len-2;i>=0;i--){
            max=Math.max(max,arr[i]);
            if(max==arr[i]) gr[i]=-1;
            else gr[i]=max;
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<len-1;i++){
            if(sm[i]!=-1 && gr[i]!=-1){
                res.add(sm[i]);
                res.add(arr[i]);
                res.add(gr[i]);
                break;
            }
        }
        //System.out.println(res);
        return res;
    }
}