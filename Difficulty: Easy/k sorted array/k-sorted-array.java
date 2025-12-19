// User function Template for Java

class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx=0;
        for(int val:arr){
            map.put(val,idx);
            idx++;
        }
        Arrays.sort(arr);
        idx=0;
        for(int val:arr){
            int ind=map.get(val);
            int check=ind-idx;
            if(Math.abs(check)>k) return "No";
            idx++;
        }
        return "Yes";
    }
}