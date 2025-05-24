class Solution {
    public int lengthOfLIS(int[] nums) {
        int N=nums.length;
        int maxlen=1;
        int[] lis=new int[N];

         Arrays.fill(lis, 1);

        for(int i=N-1;i>=0;i--){
            for(int j=i+1;j<N;j++){
                if(nums[i]<nums[j]){
                    lis[i]=Math.max(lis[i],1+lis[j]);
                }
            }
            maxlen=Math.max(maxlen,lis[i]);
        }
        return maxlen;
    }
}
