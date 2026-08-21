class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n= trips.length;
        int[] dp= new int[1000];

        for(int i=0; i<n; i++){
            int l= trips[i][1];
            int r= trips[i][2];
            for(int j= l; j< r; j++){
                dp[j] += trips[i][0];
                if(dp[j] > capacity){
                    return false;
                }
            }
        }
        return true;
    }
}