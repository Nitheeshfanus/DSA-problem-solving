class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n= nums.length;
        return fun(nums, target, n-1, 0);
    }
public int fun(int[] nums, int t, int i, int sum){
        if(sum==t && i<0) return 1;
        if(i<0) return 0;
        
        return fun(nums,t,i-1,sum-nums[i]) +
               fun(nums,t,i-1,sum+nums[i]);
    }
}