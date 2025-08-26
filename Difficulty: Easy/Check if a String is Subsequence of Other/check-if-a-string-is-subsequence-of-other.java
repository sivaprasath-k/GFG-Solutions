class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int size1=s1.length(),size2=s2.length();
        int i=0,j=0;
        int in=0,count=0;;
        while(j<size2){
            if(s1.charAt(in)==s2.charAt(j)){
                in++;
                j++;
                i=j;
                count++;
            }
            else j++;
            if(count==size1) return true;
        }
        return false;
    }
};