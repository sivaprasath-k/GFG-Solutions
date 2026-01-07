class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int len=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++) map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        res.add(map.size());
        // for(int i=0;i<=n-k;i++){
        //     HashSet<Integer> map=new HashSet<Integer>();
        //     for(int j=i;j<=i+k-1;j++){
        //         map.add(arr[j]);
        //     }
        //     res.add(map.size());
        // }
        for(int i=k;i<len;i++){
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0) map.remove(arr[i-k]);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            res.add(map.size());
        }
        return res;
    }
}