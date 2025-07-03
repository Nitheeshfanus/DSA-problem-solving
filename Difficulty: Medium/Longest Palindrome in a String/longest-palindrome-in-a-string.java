
class Solution {
    static String longestPalindrome(String s) {
        // code here
        int N=s.length();
        boolean[][] dp=new boolean[N][N];
        int maxlen=1;
        String ans="";
        
        for(int i=0;i<N;i++){
            dp[i][i]=true;
            ans=s.substring(i,i+1);
        }
        
        for(int i=0;i<N-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                maxlen=2;
                ans=s.substring(i,i+2);
            }
        }
        
        for(int len=3;len<=N;len++){
            for(int i=0;i<=N-len;i++){
                int j=len+i-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
//Note: If there are multiple palindromic substrings with the
//same length, return the first occurrence of the longest palindromic 
//substring from left to right.
                    if(len>maxlen){
                    maxlen=len;
                    ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}