// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int len=arr.size(),res=Integer.MAX_VALUE;
        Collections.sort(arr);
        int j=0;
        for(int i=m-1;i<len;i++){
            int min=arr.get(i)-arr.get(j);
            res=Math.min(res,min);
            j++;
        }
        return res;
    }
}