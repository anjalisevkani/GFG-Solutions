class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int[] dp=new int[W+1];
        for(int w=wt[0];w<=W;w++){
            dp[w]=val[0];
        }
        for(int i=1;i<n;i++){
            for(int w=W;w>=wt[i];w--){
                int notTake=dp[w];
                int take=val[i]+dp[w-wt[i]];
                dp[w]=Math.max(notTake,take);
                
        
            }
        }
        return dp[W];
    }
}
