class Solution {
    public int numIslands(char[][] grid) {        //DFS
        int row=grid.length;
        int col=grid[0].length;
        int island=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    island++;
                    dfs(row,col,grid,i,j);
                }
            }
        }
        return island;
    }
     int[][] diff=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    private void dfs(int row,int col,char[][] grid,int i,int j){
       grid[i][j]='0';
       for(int k=0;k<4;k++){
        int adjr=i+diff[k][0];
        int adjc=j+diff[k][1];
        if(adjr>=0 && adjr<row && adjc>=0 && adjc<col && grid[adjr][adjc]=='1'){
            dfs(row,col,grid,adjr,adjc);
        }
       }
       
    }
    

}