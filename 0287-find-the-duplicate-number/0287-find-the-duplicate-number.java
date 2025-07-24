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