class Solution {
    public int maximizeMoney(int n, int k) {
        // code here
        if(n==0) return 0;
        int prev2=0;
        int prev=k;
        for(int i=1;i<n;i++){
            int include=k+prev2;
            int exclude=prev;
            int curr=Math.max(include,exclude);
            prev2=prev;
            prev=curr;

        }
        return prev;
    }
}