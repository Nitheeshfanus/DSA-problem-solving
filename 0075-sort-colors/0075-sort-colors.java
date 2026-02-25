class Solution {
    public void sortColors(int[] nums) {
        int one=0,two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) one++;
            else if (nums[i]==1) two++;
            
        }
        int left=0;
        
            while(left<one){
                nums[left]=0;
                left++;
            }
            while(left<two+one){
                nums[left]=1;
                left++;
            }
            while(left<nums.length){
                nums[left]=2;
                left++;
            }
        
    }
}