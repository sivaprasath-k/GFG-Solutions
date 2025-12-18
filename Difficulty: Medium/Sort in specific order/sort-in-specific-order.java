class Solution {
    public void sortIt(int[] arr) {
        // code here
        Arrays.sort(arr);
        int len=arr.length;
        ArrayList<Integer> par1=new ArrayList<>();
        ArrayList<Integer> par2=new ArrayList<>();
        for(int i=len-1;i>=0;i--){
            if(arr[i]%2!=0) par1.add(arr[i]);
            else par2.add(arr[i]);
        }
        int idx=par2.size()-1;
        for(int i=0;i<len;i++){
            if(i<par1.size()){
                arr[i]=par1.get(i);
            }
            else{
               arr[i]=par2.get(idx);
               idx--;
            }
        }
    }
}
