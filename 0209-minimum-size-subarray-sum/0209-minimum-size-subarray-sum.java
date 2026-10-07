class Solution {
    public int minSubArrayLen(int target, int[] nums){
        int left=0,right,sum=0;
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        for(right=0;right<n;right++){
            sum=sum+nums[right];
            while(sum>=target){
                res=Math.min(res,right-left+1);
                sum=sum-nums[left++];
            }
        }
        return (res==Integer.MAX_VALUE)?0:res;

    }
}