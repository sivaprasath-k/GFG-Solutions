class Solution {
    public boolean validgroup(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int r=k,i=0,j=0;
        if(arr.length%k!=0){
            return false;
        } 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int u=0,v=0;
        for(i=0;i<arr.length;i++){
            if(map.get(arr[i])==0){
                continue;
            }
            u=arr[i];
            for(j=0;j<k;j++){
                v=u+j;
                if(map.getOrDefault(v,0)==0){
                    return false;
                }
                map.put(v,map.get(v)-1);
            }
        }
        return true;
    }
} 