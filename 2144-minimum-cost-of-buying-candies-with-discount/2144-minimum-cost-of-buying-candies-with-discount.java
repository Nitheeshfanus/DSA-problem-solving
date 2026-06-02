class Solution {
    public int minimumCost(int[] cost) {
        int n= cost.length;
        int ans=0;
        if(n<=2){
            for(int i=0; i<n; i++){
                ans+= cost[i];
            }
            return ans;
        }
        Arrays.sort(cost);
        int i=n-1;
        for(i=n-1; i>=2; i-=3){
            ans+= cost[i]+cost[i-1];
        }
       while(i>=0){
        ans+= cost[i--];
       }
        return ans;
    }
}