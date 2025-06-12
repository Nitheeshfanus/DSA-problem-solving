class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=Math.max(Math.abs(nums[i-1]-nums[i%n]),ans);
        }
        return ans;
    }
}
