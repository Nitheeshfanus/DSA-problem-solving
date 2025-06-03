class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        Set<Character> set = new LinkedHashSet<>(s.length());
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (set.add(s.charAt(right))) {
                right++;
                len = Math.max(len, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return len;
    }
}
