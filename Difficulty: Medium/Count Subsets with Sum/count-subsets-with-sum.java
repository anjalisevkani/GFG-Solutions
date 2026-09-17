class Solution {
    static int perfectSum(int[] arr, int target) {
        int n = arr.length;

        int[][] dp = new int[n + 1][target + 1];

        // One subset has sum 0: the empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int sum = 0; sum <= target; sum++) {

                // Don't take current element
                dp[i][sum] = dp[i - 1][sum];

                // Take current element
                if (arr[i - 1] <= sum) {
                    dp[i][sum] += dp[i - 1][sum - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }
}