class Solution {
    public int[] circularGameLosers(int n, int k) {
        int i = 0, v = 0;
        boolean[] visit = new boolean[n];
        while (visit[i % n] == false) {
            v++;
            visit[i % n] = true;
            i = i + (v * k); // +i adds the movement to the current position.
        }
        int[] res = new int[n - v];
        int j = 0;
        for (i = 0; i < visit.length; i++) {
            if (visit[i] == false)
                res[j++] = i + 1;
        }
        return res;

    }
}
