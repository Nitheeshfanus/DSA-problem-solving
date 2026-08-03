class Solution {
    public int characterReplacement(String s, int k) {
        
        int n= s.length();
        int l=0;
        int[] freq= new int[26];
        int maxf= 0;
        int ans=0;

        for(int r= 0; r < n; r++){

            int i= s.charAt(r)-'A';
            freq[i]++;
            maxf= Math.max(maxf,freq[i]);

            while((r-l+1) - maxf > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            ans= Math.max(ans, (r-l+1));
        }
        return ans;
    }
}