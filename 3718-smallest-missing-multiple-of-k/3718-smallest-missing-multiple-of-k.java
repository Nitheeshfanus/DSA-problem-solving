class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n= nums.length;

        HashSet<Integer> hs= new HashSet<>();

        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }
        int mul =1;
        while(hs.contains(mul * k)){
            mul++;
        }
        return mul * k;
    }
}