class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int total=1<<n;
        int ans=0;
        
        for(int mask=0;mask<total;mask++){
             int calOR=0;

            for(int i=0;i<n;i++){
                if((mask & (1<<i)) !=0 ){
                     calOR|=nums[i];
                }
            }
             if(calOR>max){
                ans= 1;
                max= calOR;
             }
             else if(calOR==max){
                ans++;
             }
        }
        return ans;
    }
}