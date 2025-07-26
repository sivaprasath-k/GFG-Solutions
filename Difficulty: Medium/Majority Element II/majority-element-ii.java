class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        Arrays.sort(arr);
        HashSet<Integer> a=new HashSet<>();
        int size=arr.length/3;
        for(int i=0;i<arr.length;i++){
            int check=i+size;
            if(check>=arr.length) break;
            if(arr[i]==arr[check]){
                a.add(arr[i]);
                i=check;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        Iterator<Integer> i=a.iterator();
        while(i.hasNext()){
            ans.add(i.next());
        }
        Collections.sort(ans);
        return ans;
    }
}