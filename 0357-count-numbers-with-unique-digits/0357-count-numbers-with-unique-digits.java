class Solution {

    int count = 1; // include 0

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        boolean[] used = new boolean[10];

        for (int i = 1; i <= 9; i++) {
            used[i] = true;
            backtrack(n, 1, used);
            used[i] = false;
        }

        return count;
    }

    private void backtrack(int n, int length, boolean[] used) {

        count++;

        if (length == n) return;

        for (int i = 0; i <= 9; i++) {
            if (!used[i]) {
                used[i] = true;
                backtrack(n, length + 1, used);
                used[i] = false;
            }
        }
    }
}