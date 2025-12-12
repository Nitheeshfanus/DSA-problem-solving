class Solution {
    public int cutRod(int[] price) {
        // code here
         int n = price.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {          // i = piece length
            for (int j = 1; j <= n; j++) {      // j = total rod length

                dp[i][j] = dp[i - 1][j];        // don't use this piece

                if (j >= i) {                   // use this piece
                    dp[i][j] = Math.max(dp[i][j], price[i - 1] + dp[i][j - i]);
                }
            }
        }

        return dp[n][n];
    }
}