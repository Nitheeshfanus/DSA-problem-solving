class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        return helper(1, n, dp);
    }

    private int helper(int start, int end, int[][] dp) {
        if (start >= end) return 0;
        if (dp[start][end] != 0) return dp[start][end];

        int minCost = Integer.MAX_VALUE;
        for (int x = start; x <= end; x++) {
            int cost = x + Math.max(helper(start, x - 1, dp), helper(x + 1, end, dp));
            minCost = Math.min(minCost, cost);
        }
        dp[start][end] = minCost;
        return minCost;
    }
}
