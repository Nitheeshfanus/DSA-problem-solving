 class Solution {
    // Function to find GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;

        // Step 1: Find overall GCD of the array
        int overallGCD = nums[0];
        for (int num : nums) {
            overallGCD = gcd(overallGCD, num);
        }
        if (overallGCD != 1) return -1; // impossible case

        // Step 2: Count existing 1's
        int countOnes = 0;
        for (int num : nums) {
            if (num == 1) countOnes++;
        }
        if (countOnes > 0) return n - countOnes; // only need to make others 1

        // Step 3: Find smallest subarray whose GCD = 1
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentGCD = nums[i];
            for (int j = i + 1; j < n; j++) {
                currentGCD = gcd(currentGCD, nums[j]);
                if (currentGCD == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        // Step 4: Total operations = (minLen - 1) to get first 1 + (n - 1) to make all 1's
        return (minLen - 1) + (n - 1);
    }
}
