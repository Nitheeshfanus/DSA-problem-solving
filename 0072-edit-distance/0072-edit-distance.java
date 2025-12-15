class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] dp = new int[m + 1];

        // Base case: converting "" -> word2
        for (int j = 0; j <= m; j++) {
            dp[j] = j;
        }

        for (int i = 1; i <= n; i++) {
            int prevDiag = dp[0]; // dp[i-1][j-1]
            dp[0] = i;            // converting word1[0..i] -> ""

            for (int j = 1; j <= m; j++) {
                int temp = dp[j]; // save dp[i-1][j]

                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[j] = prevDiag;
                } else {
                    dp[j] = 1 + Math.min(
                        prevDiag,          // replace
                        Math.min(dp[j],    // delete
                                 dp[j - 1])// insert
                    );
                }
                prevDiag = temp;
            }
        }
        return dp[m];
    }
}
