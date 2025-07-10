class Solution {
    public String longestString(String[] arr) {
        // code here
        Set<String> a=new HashSet<>(Arrays.asList(arr));
         Arrays.sort(arr);
         //boolean[] check=new boolean[arr.length];
         String ans="";
         for(String word:arr){
             String c=word.substring(0,word.length()-1);
             if(a.contains(c)){
                 if(word.length()>ans.length() || (word.length()==ans.length() && word.compareTo(ans)<0)){
                     ans=word;
                 }
             }
         }
         return ans;
    }
}
