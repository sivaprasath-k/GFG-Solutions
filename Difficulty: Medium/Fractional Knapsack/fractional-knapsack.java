class Solution {
    public double fractionalKnapsack(int[] pro, int[] wt, int cap) {
        // code here
        int size=pro.length;
        double ans=0;
        int idx=0,flag=0;
        double[][] ratio=new double[size][2];
        for(int i=0;i<size;i++){
            ratio[i][0]=(double)pro[i]/wt[i];
            ratio[i][1]=i;
        }
        Arrays.sort(ratio,(a,b)-> Double.compare(b[0],a[0]));
        for(int i=0;i<size;i++){
            idx=(int)ratio[i][1];
            if(cap>=wt[idx]){
                ans+=pro[idx];
                cap-=wt[idx];
            }
            else{
                flag=1;
                break;
            }
        }
        if(cap>0 && flag==1){
            ans+=(((double)pro[idx]/wt[idx])*cap);
        }
        return ans;
    }
}