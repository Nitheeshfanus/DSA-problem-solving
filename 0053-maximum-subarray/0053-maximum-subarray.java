class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];

        for(int num : nums){
            sum += num;
            maxSum = sum > maxSum ? sum : maxSum;
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}