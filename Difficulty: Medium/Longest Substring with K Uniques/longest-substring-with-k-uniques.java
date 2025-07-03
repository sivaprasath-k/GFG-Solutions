class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        int i=0,j=0,max=-1;
        while(j<s.length()){
            char q=s.charAt(j);
            map.put(q,map.getOrDefault(q,0)+1);
            if(map.size()==k){
                max=Math.max(max,j-i+1);
            }
            else if(map.size()>k){
                while(map.size()>k){
                    char w=s.charAt(i);
                    map.put(w,map.getOrDefault(w,0)-1);
                    if(map.get(w)<=0){
                        map.remove(w);
                    }
                    i++;
                }
            }
            if(map.size()==k){
                max=Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}