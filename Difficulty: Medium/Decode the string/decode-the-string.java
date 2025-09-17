class Solution {
    static String decodeString(String s) {
        // code here
        StringBuilder cur=new StringBuilder();
        int num=0;
        Stack<StringBuilder> st=new Stack<>();
        Stack<Integer> count=new Stack();
        for(char val:s.toCharArray()){
            if(Character.isDigit(val)){
                int in=val-'0';
                num=(num*10)+in;
            }
            else if(val=='['){
                count.add(num);
                st.add(cur);
                num=0;
                cur=new StringBuilder();
            }
            else if(val==']'){
                StringBuilder pre=st.pop();
                int repeat=count.pop();
                for(int i=0;i<repeat;i++){
                    pre.append(cur);
                }
                cur=pre;
            }
            else cur.append(val);
        } 
        return cur.toString();
    }
}