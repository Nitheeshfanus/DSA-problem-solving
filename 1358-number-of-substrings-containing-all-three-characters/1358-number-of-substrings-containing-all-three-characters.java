class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] f= new int[3];
        int l=0;
        int ans=0;

        for(int i=0; i<n; i++){

            f[s.charAt(i) - 'a']++;

            while(f[0] > 0 && f[1] > 0 && f[2] > 0){
                
                f[s.charAt(l) - 'a']--;
                l++;
            }
            ans += l;
        }
        return ans;
    }
}