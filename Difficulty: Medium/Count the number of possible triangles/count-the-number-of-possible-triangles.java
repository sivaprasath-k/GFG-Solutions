class Solution {
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int a=arr.length;
        for(int i=0;i<a-2;i++){
            for(int j=i+1;j<a-1;j++){
                int sum=arr[i]+arr[j];
                int k=j+1;
                while(k<a && sum>arr[k]){
                    count++;
                    k++;
                }
            }
        }
        return count;
    }
}