class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        ArrayList<Integer> q=new ArrayList<>();
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=b.length-1;j>=0;j--){
                if(b[j]<=a[i]){
                    q.add(j+1);
                    c=1;
                    break;
                }
            }
            if(c==0){
                q.add(0);
            }
            c=0;
        }
        return q;
    }
}