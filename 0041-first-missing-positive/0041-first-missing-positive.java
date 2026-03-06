class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int N= nums.length;

        for(int i=0; i<N; i++){
            if(nums[i] >=1 && nums[i]<=N){
            if(i+1 != nums[i]  && nums[i] != nums[nums[i]-1]){
                swap(nums[i]-1,i,nums);
                i--;
            }
            }
        }
         for(int i=0; i<N; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return N+1;
    }
    public void swap(int i, int j,int[] nums){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}