class Solution {
    public int minDistance(String word1, String word2) {
        int n1= word1.length();
        int n2=word2.length();
        int[][] dp= new int[n1][n2];
        //Arrays.fill(dp,-1);
        return rec(n1-1,n2-1,word1,word2,dp);
    }
    public int rec(int i, int j, String word1, String word2, int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;

        if(dp[i][j]!=0) return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j)){
            return 0 + rec(i-1, j-1, word1, word2, dp);
        }
        
        else{
            return dp[i][j]=1+ Math.min(rec(i-1, j-1, word1, word2, dp),
        Math.min(rec(i-1, j, word1, word2,dp),rec(i, j-1, word1, word2,dp)));
        }
    }
}