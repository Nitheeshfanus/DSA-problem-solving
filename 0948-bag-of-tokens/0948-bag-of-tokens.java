class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n= tokens.length;
        int i= 0;
        int j= n-1;
        int score= 0;
        Arrays.sort(tokens);
        int maxScore= 0;
        if(n== 1){
            if(power < tokens[0]){
                return 0;
            }
            else{
                return 1;
            }
        }
        while(i <= j){
            if(tokens[i] <= power){
                power -= tokens[i];
                score++;
                maxScore= Math.max(score, maxScore);
                i++;
            }
            else if(score >= 1 ){
                power += tokens[j];
                j--;
                score--;
            }
            else{
                break;
            }

        }
        return maxScore;
    }
}