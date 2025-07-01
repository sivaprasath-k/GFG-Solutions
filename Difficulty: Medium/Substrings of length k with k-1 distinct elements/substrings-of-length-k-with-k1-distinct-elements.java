class Solution {
    public int substrCount(String s, int k) {
        // code here
        int m=s.length(),in=0,ans=0;
        HashSet<String> set=new HashSet<String>();
        while(in+k<=m){
            for(int i=in;i<in+k;i++){
                set.add(String.valueOf(s.charAt(i)));
            }
            if(set.size()==k-1){
                ans++;
            }
            set.clear();
            in++;
        }
        return ans;
    }
}