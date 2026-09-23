class Solution {
    public int totalWays(int[] arr, int target) {
        // code here
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        if((totalSum+target)%2==1){
            return 0;
        }
        if(Math.abs(target)>totalSum){
            return 0;
        }
        int sum=(totalSum+target)/2;
        return countSubsets(arr,sum);
    }
    static int countSubsets(int[] arr,int sum){
        int n=arr.length;
        int[][] dp=new int[n+1][sum+1];
        dp[n][0]=1;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=sum;j++){
                if(arr[i]>j){
                    dp[i][j]=dp[i+1][j];
                }else{
                    dp[i][j]=dp[i+1][j-arr[i]]+dp[i+1][j];
                }
            }
        }
        return dp[0][sum];
    }
}