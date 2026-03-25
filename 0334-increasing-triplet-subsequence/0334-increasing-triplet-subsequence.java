class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n= nums.length;
        if(n<3){
            return false;
        }

        int a1= Integer.MAX_VALUE;
        int a2= Integer.MAX_VALUE;

        for(int i=0 ;i< nums.length; i++){

        if(nums[i] <= a1){
                a1= nums[i];
            }
        else if(nums[i] <= a2){
                a2= nums[i];
            }
        else{
            return true;
        }
        }
        return false;
    }
}