class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        int len1=s1.length(),len2=s2.length();
        String pre="";
        for(int i=0;i<=len1-len2;i++){
            int j=0,k=0;
            for(j=i;j<len1;j++){
                char val=s1.charAt(j);
                if(val==s2.charAt(k)){
                    k++;
                }
                if(k>=len2){
                    String cur=s1.substring(i,j+1);
                    if(pre.isEmpty() || pre.length()>cur.length()) pre=cur;
                    break;
                }
            }
         }
        return pre;
    }
}
