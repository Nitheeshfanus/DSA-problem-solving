class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int N=arr.length;
        int[] dp=new int[N];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<N;i++){
            dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        return dp[N-1];
    }
}