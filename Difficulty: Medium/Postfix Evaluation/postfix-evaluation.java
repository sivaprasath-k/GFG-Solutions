class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st=new Stack();
        int num1=0,num2=0;
        double res=-1;
        for(String str:arr){
            if(str.matches("-?\\d+")){
                int a=Integer.parseInt(str);
                st.add(a);
            }
            else{
                char val=str.charAt(0);
                    num2=st.pop();
                    num1=st.pop();
                switch(val){
                    case '+':
                        res=num1+num2;
                        break;
                    case '-':
                        res=num1-num2;
                        break;
                    case '*':
                        res=num1*num2;
                        break;
                    case '/':
                        res=(double)num1/num2;
                        res=(int)Math.floor(res);
                        break;
                    case '^':
                        res=Math.pow(num1,num2);
                        break;
                }
                st.add((int)res);
            }
        }
        return (int)st.pop();
    }
}