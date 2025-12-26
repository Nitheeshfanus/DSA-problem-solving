import java.util.*;

class Solution {
    public int minimumDifference(int[] nums) {
        int N = nums.length;
        int n = N / 2;

        long totalSum = 0;
        for (int x : nums) totalSum += x;

        List<List<Integer>> leftSums = new ArrayList<>();
        List<List<Integer>> rightSums = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            leftSums.add(new ArrayList<>());
            rightSums.add(new ArrayList<>());
        }

        // Generate subset sums
        for (int mask = 0; mask < (1 << n); mask++) {
            int count = 0, sumL = 0, sumR = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    count++;
                    sumL += nums[i];
                    sumR += nums[i + n];
                }
            }
            leftSums.get(count).add(sumL);
            rightSums.get(count).add(sumR);
        }

        long ans = Long.MAX_VALUE;

        // Process each count
        for (int k = 0; k <= n; k++) {
            List<Integer> L = leftSums.get(k);
            List<Integer> R = rightSums.get(n - k);

            Collections.sort(L);
            Collections.sort(R);

            int i = 0;
            int j = R.size() - 1;

            // Two-pointer sweep
            while (i < L.size() && j >= 0) {
                long sum = (long) L.get(i) + R.get(j);
                ans = Math.min(ans, Math.abs(totalSum - 2 * sum));

                if (2 * sum < totalSum) {
                    i++;   // need bigger sum
                } else {
                    j--;   // need smaller sum
                }
            }
        }

        return (int) ans;
    }
}
