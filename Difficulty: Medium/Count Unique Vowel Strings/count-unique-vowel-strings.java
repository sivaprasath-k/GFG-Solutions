class Solution {
    public int vowelCount(String s) {
        // code here
        HashMap<Character,Integer> a=new HashMap<>();
        HashSet<String> b=new HashSet<>();
        int pro=1,ind=1;
        char[] vow={'a','e','i','o','u'};
        String v="aeiou";
        for(int i=0;i<s.length();i++){
            String c=String.valueOf(s.charAt(i));
            if(b.size()<5 && v.indexOf(c)!=-1 && !b.contains(c)){
                b.add(c);
                pro*=ind;
                ind++;
            }
            char q=s.charAt(i);
            a.put(q,a.getOrDefault(q,0)+1);
        }
        //System.out.println(pro);
        int ind1=0;
        while(ind1<5){
            if(a.containsKey(vow[ind1])){
                int val=a.get(vow[ind1]);
                pro*=val;
            }
            ind1++;
        }
        if(b.size()==0){
            return 0;
        }
        return pro;
    }
}

// pro=a.get('a')*a.get('e')*a.get('i')*a.get('o')*a.get('u');