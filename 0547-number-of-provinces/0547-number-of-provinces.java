class Solution {
    public int findCircleNum(int[][] mat) {
        int n= mat.length;
        boolean[] vis= new boolean[n];
        int count= 0;

        for(int i=0; i<n; i++){
            if(!vis[i]){
                count++;
                dfs(mat, vis, i);
            }
        }
        return count;
    }
    void dfs(int[][] mat, boolean[] vis, int r){
        vis[r]= true;
        for(int i=0; i<mat.length; i++){
            if( mat[r][i] ==1 && !vis[i]){
                dfs(mat, vis, i);
            }
        }
    }
}