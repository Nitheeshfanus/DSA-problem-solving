class Solution {
    public int islandPerimeter(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        	for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        if(grid[row][col]==1){
		            return dfs(grid,row,col);
		        }
		    }
		}
		return 0;

	}

	public static int dfs(int[][] grid,int row,int col){
	    if(row<0 || row>=grid.length || col<0 || col>=grid[0].length ||grid[row][col]==0){
	        return 1;
	    }
	    if(grid[row][col]==-1){
	        return 0;
	    }
	    grid[row][col]=-1;
	    return dfs(grid,row+1,col)+dfs(grid,row-1,col)+dfs(grid,row,col+1)+dfs(grid,row,col-1);
    }
}