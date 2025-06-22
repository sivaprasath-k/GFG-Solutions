// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int i=0,j=0,s=arr.length,c=0,f=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(i<s && j<s){
            if(arr[i]<=dep[j]){
                c++;
                i++;
            }
            else{
                c--;
                j++;
            }
            f=Math.max(f,c);
        }
        return f;
    }
}
