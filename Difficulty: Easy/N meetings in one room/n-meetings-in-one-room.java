class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int len=start.length;
        int[][] arr=new int[len][2];
        for(int i=0;i<len;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        int res=1,e=arr[0][1];
        for(int i=1;i<len;i++){
            if(arr[i][0]>e){
                res++;
                e=arr[i][1];
            }
        }
        return res;
    }
}
