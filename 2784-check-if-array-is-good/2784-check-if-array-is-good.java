class Solution {
    public boolean isGood(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        if(n==1){
            return false;
        }
        if(nums[n-1] != nums[n-2] && nums[n-1] != n-1){
            return false;
        }
        for(int i=0; i<= n-2; i++){
            if(i+1 != nums[i]){
                return false;
            }
        }
        return true;
    }
}