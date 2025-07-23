class Solution {
    public int findGCD(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mn){
                mn=nums[i];
            }
            if(nums[i]>mx){
                mx=nums[i];
            }
        }
        while(mn!=0){
            int temp=mn;
            mn=mx%mn;
            mx=temp;
        }
        return mx;
    }
}