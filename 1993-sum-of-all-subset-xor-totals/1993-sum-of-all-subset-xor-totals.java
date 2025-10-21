class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=0;
        int n=nums.length;
        int total=1<<n;
        for(int mask=0;mask<total;mask++){
             int calXOR=0;

            for(int i=0;i<n;i++){
                if((mask & (1<<i)) !=0 ){
                     calXOR^=nums[i];
                }
            }
            ans+=calXOR;
        }
        return ans;
    }
}