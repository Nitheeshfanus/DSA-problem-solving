class Solution {
    public int countOdds(int low, int high) {
        int ans=0;
        int N=(high-low+1);
        if(N%2==0){
            ans=N/2;
        }
        else{
            if(low%2!=0 || high%2!=0){
                ans=N/2+1;
            }
            else{
                ans=N/2;
            }
        }
        return ans;
    }
}