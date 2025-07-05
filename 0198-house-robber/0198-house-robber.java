class Solution {
    public int rob(int[] nums) {
        int N=nums.length;
         int prev1=0,prev2=0;
        for(int start=0;start<N;start++){
            int temp=prev1;
            prev1=Math.max(prev1,nums[start]+prev2);
            prev2=temp;
        }
        return prev1;
    }
}