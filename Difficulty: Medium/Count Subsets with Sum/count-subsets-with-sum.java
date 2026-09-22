class Solution {
    static int perfectSum(int[] arr, int target) {
        int n=arr.length;
        int[][] dp=new int[n+1][target+1];
        
        dp[n][0]=1;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=target;j++){
                if(arr[i]>j){
                    dp[i][j]=dp[i+1][j];
                }else{
                    dp[i][j]=dp[i+1][j-arr[i]]+dp[i+1][j];
                }
            }
        }
        return dp[0][target];
    }
}