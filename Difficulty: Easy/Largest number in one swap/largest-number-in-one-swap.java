class Solution {
    public String largestSwap(String s) {
        // code here
        int max=Integer.MIN_VALUE,flag=0,ind1=0,ind2=0;
        char[] str=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            int start=i;
            int val1=s.charAt(start)-'0';
            int end=s.length()-1;
            while(start!=end){
                int val2=s.charAt(end)-'0';
                if(val2>val1 && val2>max){
                    max=val2;
                    flag=1;
                    ind1=start;
                    ind2=end;
                }end--;
            }
            if(flag==1){
                char q=str[ind1];
                str[ind1]=str[ind2];
                str[ind2]=q;
                break;
            }
        }
        if(flag==0) return s;
        return new String(str);
    }
}