 class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long pref = 0;
        long ans = Long.MIN_VALUE;

        // minPrefix[r] = minimum prefix sum seen so far
        // at indices whose index % k == r
        long[] minPrefix = new long[k];

        // Initialize with very large values
        for (int i = 0; i < k; i++) {
            minPrefix[i] = Long.MAX_VALUE;
        }

        // Handle the virtual index -1:
        // prefix[-1] = 0 and (-1 % k) -> k-1
        minPrefix[k - 1] = 0;

        for (int i = 0; i < nums.length; i++) {
            pref += nums[i];

            int rem = i % k;

            // If we already have some prefix with same remainder,
            // try to form a valid subarray
            if (minPrefix[rem] != Long.MAX_VALUE) {
                ans = Math.max(ans, pref - minPrefix[rem]);
            }

            // Update minimum prefix for this remainder
            minPrefix[rem] = Math.min(minPrefix[rem], pref);
        }

        return ans;
    }
}
