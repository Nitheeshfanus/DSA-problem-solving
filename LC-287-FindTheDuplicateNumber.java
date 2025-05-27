// With Extra Space
class Solution {
    public int findDuplicate(int[] nums) {
        int N=nums.length;
        boolean[] check=new boolean[N];
        for(int i=0;i<N;i++){
            if(check[nums[i]]!=true){
                check[nums[i]]=true;
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
} 

//With Constant Extra Space
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find intersection point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to cycle (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
