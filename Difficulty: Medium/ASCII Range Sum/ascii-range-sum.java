class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=s.length()-1;i>=0;i--){
            char a=s.charAt(i);
            if(!map.containsKey(a)){
                map.put(a,i);
            }
        }
        int i=0,sum=0,flag=0;
        while(i<s.length()){
            char b=s.charAt(i);
            sum=0;
            if(map.containsKey(b) && map.get(b)!=i){
                flag=1;
                for(int j=i+1;j<map.get(b);j++){
                    sum+=(int)s.charAt(j);
                }
                map.remove(b);
            }
            if(flag==1 && sum!=0) list.add(sum);
            flag=0;
            i++;
        }
        return list;
    }
}