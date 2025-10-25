class Solution {
    public int minImpossibleOR(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int a : nums)
            s.add(a);
        int a = 1;
        while (s.contains(a))
            a <<= 1;
        return a;
    }
}