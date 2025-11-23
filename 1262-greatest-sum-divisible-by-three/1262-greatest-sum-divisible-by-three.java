class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int n : nums) {
            int[] next = dp.clone();

            for (int r = 0; r < 3; r++) {
                if (dp[r] != Integer.MIN_VALUE) {
                    int newSum = dp[r] + n;
                    int newR = newSum % 3;
                    next[newR] = Math.max(next[newR], newSum);
                }
            }

            dp = next;
        }

        return dp[0];  // maximum sum divisible by 3
    }
}
