class Solution {
    public int minParentheses(String s) {
        // code here
        int res=0;
        Stack<Character> st=new Stack<>();
        for(char val:s.toCharArray()){
            if(val=='(') st.add('(');
            else{
                if(!st.isEmpty()) st.pop();
                else res++;
            }
        }
        if(!st.isEmpty()) return res+st.size();
        return res;
    }
}
