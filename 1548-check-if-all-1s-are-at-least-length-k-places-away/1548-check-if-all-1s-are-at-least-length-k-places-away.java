class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        if(k==0){
            return true;
        }
        int left=-1;
        for(int i=0; i<n ;i++){
            if(nums[i]==1){
                if(left!=-1 && (i-left-1)<k){
                    return false;
                }
                left=i;
            }
        }
        return true;
    }
}