 class Solution {
    public int maxOperations(String s) {
        int ans = 0;
        int i = 0;
        int count = 0;
        int n = s.length();
        while (i < n) {
            while (i < n && s.charAt(i) == '1') {
                count++;
                i++;
            }
            if (i < n && s.charAt(i) == '0') { // next zero encountered
                ans += count;
            }
            while (i < n && s.charAt(i) == '0') {
                i++;
            }
        }
        return ans;
    }
}