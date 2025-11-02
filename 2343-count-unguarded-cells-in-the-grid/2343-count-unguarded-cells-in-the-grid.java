 class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
         
        // mark guards and walls as 2 (occupied)
        for (int[] g : guards) grid[g[0]][g[1]] = 2;
        for (int[] w : walls) grid[w[0]][w[1]] = 2;
        
        // mark guarded cells in 4 directions from each guard
        for (int[] g : guards) {
            int r = g[0], c = g[1];
            
            // UP
            for (int i = r - 1; i >= 0; i--) {
                if (grid[i][c] == 2) break; // blocked by wall or guard
                if (grid[i][c] == 1) continue; // already guarded
                grid[i][c] = 1; // mark as guarded
            }
            
            // DOWN
            for (int i = r + 1; i < m; i++) {
                if (grid[i][c] == 2) break;
                if (grid[i][c] == 1) continue;
                grid[i][c] = 1;
            }
            
            // LEFT
            for (int j = c - 1; j >= 0; j--) {
                if (grid[r][j] == 2) break;
                if (grid[r][j] == 1) continue;
                grid[r][j] = 1;
            }
            
            // RIGHT
            for (int j = c + 1; j < n; j++) {
                if (grid[r][j] == 2) break;
                if (grid[r][j] == 1) continue;
                grid[r][j] = 1;
            }
        }
        
        // count unguarded (value 0)
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }
        
        return count;
    }
}
