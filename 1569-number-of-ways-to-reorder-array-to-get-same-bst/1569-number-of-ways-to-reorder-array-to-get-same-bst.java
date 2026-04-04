import java.util.*;

class Solution {
    long[][] table;
    int MOD = 1_000_000_007;

    public int numOfWays(int[] nums) {
        int n = nums.length;

        // build Pascal's triangle (nCr table)
        table = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            table[i][0] = table[i][i] = 1;
            for (int j = 1; j < i; j++) {
                table[i][j] = (table[i - 1][j - 1] + table[i - 1][j]) % MOD;
            }
        }

        long ans = dfs(nums);
        return (int)((ans - 1 + MOD) % MOD); // subtract original ordering
    }

    private long dfs(int[] nums) {
        int n = nums.length;

        if (n <= 2) return 1;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // split into left and right subtree
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[0]) left.add(nums[i]);
            else right.add(nums[i]);
        }

        long lans = dfs(toArray(left)) % MOD;
        long rans = dfs(toArray(right)) % MOD;

        int leftSize = left.size();

        // combine using nCr
        return (((table[n - 1][leftSize] * lans) % MOD) * rans) % MOD;
    }

    private int[] toArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}