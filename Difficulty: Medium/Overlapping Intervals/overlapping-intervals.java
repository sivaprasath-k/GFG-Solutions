class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]> res=new ArrayList<>();
        int[] ans=new int[2];
        int com=arr[0][1],sec=com;
        ans[0]=arr[0][0];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=com){
                if(arr[i][1]>com){
                    sec=arr[i][1];
                    com=arr[i][1];
                }
            }
            else{
                ans[1]=sec;
                res.add(ans);
                ans=new int[2];
                ans[0]=arr[i][0];
                com=arr[i][1];
                sec=arr[i][1];
            }
        }
        ans[1]=sec;
        res.add(ans);
        //System.out.println(arr[0][0]);
        return res;
    }
}