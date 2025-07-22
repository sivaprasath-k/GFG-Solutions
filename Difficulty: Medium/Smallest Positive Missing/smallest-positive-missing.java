class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        int i=0,ans=0,pin=0;
        while(i<arr.length){
            if(arr[i]>=0){
                pin=i;
                break;
            }
            i++;
        }
        if(arr[pin]!=1 && arr[pin]!=0) return 1;
        int pre=arr[pin];
        pin++;
        if(pin>=arr.length) return arr[pin-1]+1;
        while(pin<arr.length){
            if(pre!=arr[pin] && pre+1!=arr[pin]){
                ans=pre+1;
                break;
            }
            pre=arr[pin];
            pin++;
            if(pin>=arr.length) return arr[pin-1]+1;
        }
        return ans;
    }
}
