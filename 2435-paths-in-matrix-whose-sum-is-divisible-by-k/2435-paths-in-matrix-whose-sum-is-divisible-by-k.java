class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int MOD = 1_000_000_007;
        int m = grid.length, n = grid[0].length;

        int[][][] dp = new int[m][n][k];

        // Base case
        dp[0][0][grid[0][0] % k] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int r = 0; r < k; r++) {
                    if (i == 0 && j == 0) continue;
                    int val = grid[i][j];
                    int newR = (r + val) % k;

                    // From top
                    if (i > 0) {
                        dp[i][j][newR] = (dp[i][j][newR] + dp[i - 1][j][r]) % MOD;
                    }

                    // From left
                    if (j > 0) {
                        dp[i][j][newR] = (dp[i][j][newR] + dp[i][j - 1][r]) % MOD;
                    }
                }
            }
        }

        return dp[m - 1][n - 1][0];
    }
}