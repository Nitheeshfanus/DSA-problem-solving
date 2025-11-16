class Solution {
    public int numSub(String s) {
        long mod = 1000000007;
        long ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                int j = i;

                // count consecutive 1's
                while (j < n && s.charAt(j) == '1') {
                    j++;
                }

                long len = j - i;  // number of continuous 1's
                long add = (len * (len + 1) / 2) % mod;
                ans = (ans + add) % mod;

                i = j - 1; // skip counted block
            }
        }

        return (int) ans;
    }
}
