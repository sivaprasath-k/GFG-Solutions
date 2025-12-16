class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> res=new ArrayList<>();
        int val=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val) val++;
            if(i>0 && arr[i]==arr[i-1]) res.add(arr[i]);
        }
        res.add(val);
        return res;
    }
}
