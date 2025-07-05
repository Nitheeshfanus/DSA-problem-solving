class Solution {
    public int rob(int[] nums) {
        int N=nums.length;
        if(N==1){
            return nums[0];
        }
        if(N==2){
            return Math.max(nums[0],nums[1]);
        }
        int max1=rob(nums,0,N-1);
        int max2=rob(nums,1,N);
        
        return Math.max(max1,max2);
    }
    public int rob(int[] nums,int i,int j){
        int prev1=0,prev2=0;
        for(int start=i;start<j;start++){
            int temp=prev1;
            prev1=Math.max(prev1,nums[start]+prev2);
            prev2=temp;
        }
        return prev1;
    }
}