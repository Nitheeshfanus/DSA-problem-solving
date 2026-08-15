class Solution {
    public int maximumLengthSubstring(String s) {
        
        int n= s.length();
        int[] freq= new int[26];
        int l=0;
        int ans=0;

        for(int r=0; r<n; r++){
            char c= s.charAt(r);
            freq[c-'a']++;
            if(freq[c-'a'] >2){
                while(l<n && freq[s.charAt(r)-'a'] > 2){
                    freq[s.charAt(l)-'a']--;
                    l++;
                }
            }
            ans= Math.max(ans, r-l+1);
        }
        return ans;
    }
}