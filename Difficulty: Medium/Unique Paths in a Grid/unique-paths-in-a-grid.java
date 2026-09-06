class Solution {
    public int uniquePaths(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        // Starting cell is blocked
        if (grid[0][0] == 1)
            return 0;

        dp[0][0] = 1;

        // Fill the grid
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                // Blocked cell
                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

                // Starting cell
                if (i == 0 && j == 0)
                    continue;

                int top = 0;
                int left = 0;

                if (i > 0)
                    top = dp[i - 1][j];

                if (j > 0)
                    left = dp[i][j - 1];

                dp[i][j] = top + left;
            }
        }

        return dp[n - 1][m - 1];
    }
}