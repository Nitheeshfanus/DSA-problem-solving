class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0;
        for (int i = 2; i <= n; i++) { // The loop starts from i = 2 because we already know the winner for n = 1 (index 0).

            winner = (winner + k) % i;
        }
        return winner+1;
    }
}
