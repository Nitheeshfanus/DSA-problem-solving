class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int[] dp=new int[n+1];
    
        for(int i=0; i<price.length; i++){
            for(int j=i+1; j<n+1; j++){
                
                dp[j]= Math.max(dp[j-(i+1)] + price[i], dp[j]);
            }
        }
        return dp[n];
    }
}