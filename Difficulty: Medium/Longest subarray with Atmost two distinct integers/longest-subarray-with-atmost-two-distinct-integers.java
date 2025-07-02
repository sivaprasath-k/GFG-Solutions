class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int max=0;
        while(j<arr.length){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(map.size()==2){
                max=Math.max(max,j-i+1);
            }
            if(map.size()>2){
                while(map.size()>2){
                    map.put(arr[i],map.get(arr[i])-1);
                    if(map.get(arr[i])==0){
                        map.remove(arr[i]);
                    }
                    i++;
                }
            }
            else{
                max=Math.max(max,j-i+1);
            }
             j++;   
        }
        return max;
    }
}