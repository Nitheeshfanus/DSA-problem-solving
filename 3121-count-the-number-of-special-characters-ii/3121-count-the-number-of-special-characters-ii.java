class Solution {

    public int numberOfSpecialChars(String word) {

        int[] lc = new int[26];
        int[] uc = new int[26];

        Arrays.fill(lc, -1);
        Arrays.fill(uc, -1);

        int n = word.length();

        for(int i = 0; i < n; i++) {

            char c = word.charAt(i);

            // lowercase
            if(c >= 'a' && c <= 'z') {
                lc[c - 'a'] = i; // last lowercase
            }

            // uppercase
            else if(c >= 'A' && c <= 'Z') {

                // first uppercase
                if(uc[c - 'A'] == -1) {
                    uc[c - 'A'] = i;
                }
            }
        }

        int ans = 0;

        for(int i = 0; i < 26; i++) {

            if(lc[i] != -1 &&
               uc[i] != -1 &&
               lc[i] < uc[i]) {

                ans++;
            }
        }

        return ans;
    }
}