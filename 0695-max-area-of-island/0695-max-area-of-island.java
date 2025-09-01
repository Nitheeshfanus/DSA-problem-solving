class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[] counts=new int[r*c+2];
        int count=2;
        int maxarea=Integer.MIN_VALUE;
        boolean contain=false;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    contain=true;
                    dfs(grid,i,j,r,c,counts,count);
                    maxarea=Math.max(maxarea,counts[count]);
                    count++;
                }
            }
        }
       return contain?maxarea:0;
    }
    public static int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

    public static void dfs(int[][] grid,int i,int j,int r,int c,int[] counts,
    int count)
    {
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j]!=1){
            return;
        }
        grid[i][j]=count;
        counts[count]++;

        for(int[] dir:dirs){
            dfs(grid,dir[0]+i,dir[1]+j,r,c,counts,count);
        }
    }
}