class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();

        for(int mask=0; mask<(1<<n); mask++)
        {
            List<Integer> ss=new ArrayList<>();
            for(int i=0; i<n; i++)
            {
                if((mask & (1<<i)) !=0){
                    ss.add(nums[i]);
                }
            }
            ans.add(ss);
        }
        return ans;
    }
}