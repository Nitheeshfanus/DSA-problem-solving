class Solution {
    boolean visited[];
    ArrayList<Integer>[] map;
    int ans = 0, val[], K, N;
    private int dfs(int idx){
        if(visited[idx]) return 0;
        visited[idx] = true;

        int sum = val[idx] % K;
        for(int i: map[idx]) sum = (sum + dfs(i)) % K;
        if(sum == 0) ++ans;
        return sum;
    }

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        map = new ArrayList[n];
        visited = new boolean[n];
        val = values; K = k; N = n;

        for(int i=0; i<n; i++) map[i] = new ArrayList<Integer>();
        for(int[] e: edges) {
            map[e[0]].add(e[1]);
            map[e[1]].add(e[0]);
        }

        dfs(0);
        return ans;
    }
}