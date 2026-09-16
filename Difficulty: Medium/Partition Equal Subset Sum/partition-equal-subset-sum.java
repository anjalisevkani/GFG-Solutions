class Solution {
    static boolean equalPartition(int[] arr) {
        int n = arr.length;

        int total = 0;
        for (int x : arr) {
            total += x;
        }

        // Odd total cannot be divided equally
        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;

        boolean[][] dp = new boolean[n + 1][target + 1];

        // Sum 0 is always possible: choose nothing
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int sum = 1; sum <= target; sum++) {

                // Don't take arr[i-1]
                dp[i][sum] = dp[i - 1][sum];

                // Take arr[i-1] if possible
                if (arr[i - 1] <= sum) {
                    dp[i][sum] = dp[i][sum] ||
                                 dp[i - 1][sum - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }
}