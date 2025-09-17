class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int len=arr.length;
        for(int i=1;i<len;i++){
            for(int j=i;j<len;j++){
                if(arr[i-1]>arr[j]){
                    int temp=arr[i-1];
                    arr[i-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}