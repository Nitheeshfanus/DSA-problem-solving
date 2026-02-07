class Solution {
    public int[] sortedSquares(int[] nums) {
        int i= 0;
        int j= nums.length-1;
        int k=j;
        int[] ans= new int[j+1];
        while(i <= j){
            int l= nums[i]*nums[i];
            int r= nums[j]*nums[j];
            if(l>r){
                ans[k]=l;
                i++;
            }
            else{
                ans[k]=r;
                j--;
            }
            k--;
        }
        return ans;
    }
}