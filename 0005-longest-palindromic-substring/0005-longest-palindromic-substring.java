class Solution {
    public String longestPalindrome(String s) {
        int N=s.length();
        boolean[][] mat=new boolean[N][N];
        String ans="-1";
        int maxlen=1;
        for(int i=0;i<N;i++){  //fill middle diagonal
            mat[i][i]=true;
            ans=s.substring(i,i+1); 
        }
        for(int i=0;i<N-1;i++){ //fill second diagonal
            if(s.charAt(i)==s.charAt(i+1)){
                mat[i][i+1]=true;
                maxlen=2;
                ans=s.substring(i,i+2);
            }
        }
        for(int len=3;len<=N;len++){
            for(int i=0;i<=N-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    if(mat[i+1][j-1]){
                    mat[i][j]=true;
                    maxlen=len;
                    ans=s.substring(i,j+1); //
                    }
                }
                 
            }
        }
        return ans;
    }
}