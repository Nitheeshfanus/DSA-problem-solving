class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n= nums.size();
        int i=0;
        int j= n-1;
        int count= 0;
        Collections.sort(nums);

        while(i <= j){
            int temp = nums.get(i) + nums.get(j);
            if(temp >= target){
                j--;
            }
            else{
                count+= j-i;
                i++;
            }
        }
        return count;
    }
}