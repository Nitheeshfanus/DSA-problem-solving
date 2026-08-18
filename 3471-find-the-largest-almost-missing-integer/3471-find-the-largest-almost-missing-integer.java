class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Case 1: k == 1
        if (k == 1) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            int ans = -1;

            for (int i = 0; i < n; i++) {
                if (map.get(nums[i]) == 1) {
                    ans = Math.max(ans, nums[i]);
                }
            }

            return ans;
        }

        // Case 2: k == n
        if (k == n) {
            int maxi = nums[0];

            for (int i = 1; i < n; i++) {
                maxi = Math.max(maxi, nums[i]);
            }

            return maxi;
        }

        // Case 3: 1 < k < n
        int a = check(nums, 0);
        int b = check(nums, n - 1);

        return Math.max(a, b);
    }

    public int check(int[] nums, int index) {

        for (int i = 0; i < nums.length; i++) {

            if (i != index && nums[i] == nums[index]) {
                return -1;
            }
        }

        return nums[index];
    }
}