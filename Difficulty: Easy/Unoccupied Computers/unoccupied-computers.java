class Solution {
    public int solve(int n, String s) {
        // code here
        HashMap<Character,Integer> hs1=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        int res=0;
        for(char val:s.toCharArray()){
            
            
            if(!hs1.containsKey(val) && !hs2.containsKey(val)){
             if(hs1.size()<n && !hs1.containsKey(val)) hs1.put(val,1);
             else if(!hs2.containsKey(val)) hs2.put(val,-1);
            }
            else{
                if(hs2.containsKey(val) && hs2.get(val)==-1){
                    res++;
                    hs2.remove(val);
                }
                else hs1.remove(val);
            }
            //System.out.println(val);
        }
        return res;
    }
}
