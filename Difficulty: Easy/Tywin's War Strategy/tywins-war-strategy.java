class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int size=arr.length;
        int min=(int)Math.ceil(size/2.0);
        for(int i=0;i<size;i++){
            if(arr[i]<k) arr[i]=k-arr[i];
            else{
                int a=arr[i]%k;
                if(a!=0){
                    arr[i]=k-a;
                }
                else arr[i]=0;
            }
        }
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<min;i++){
            sum+=arr[i];
        }
        return sum;
    }
}