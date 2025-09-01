class Solution {
    public static int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

    public int findMaxFish(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int maxfish=0;

        for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++)
        {
        if(grid[i][j]!=0)
        {
                    
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        int fish=0;

        while(!q.isEmpty()){
            int[] cell=q.poll();
            int x=cell[0];
            int y=cell[1];
            fish+=grid[x][y];
            grid[x][y]=0;
                        
             for(int[] dir:dirs){
                            int ar=x+dir[0];
                            int ac=dir[1]+y;
        if(ar>=0 && ar<r && ac>=0 && ac<c && grid[ar][ac]!=0){
                            q.offer(new int[]{ar,ac});
        }
                        }
                    }
                    maxfish=Math.max(maxfish,fish);
                }
            }
        }
        return maxfish;
    }
}