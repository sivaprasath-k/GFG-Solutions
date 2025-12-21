// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int len=arr.length;
        int[] ans=new int[len];
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0;i<N;i++){
            if(!map.containsKey(temp[i])) map.put(temp[i], rank++);
        }
        for(int i=0;i<N;i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
// ArrayList<Integer> a=new ArrayList<>();
//         for(int val:arr){
//             a.add(val);
//         }
//         
//         
//         for(int i=0;i<len;i++){
//             int idx=a.indexOf(arr[i]);
//             if(i>0 && arr[i-1]<arr[i]) rank++;
//             ans[idx]=rank;
//             a.set(idx,Integer.MAX_VALUE);
//         } 
