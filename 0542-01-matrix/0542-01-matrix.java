class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        boolean[][] vis=new boolean[r][c];
        int[][] dp=new int[r][c];
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }

        int count=1;
        int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

        while(!q.isEmpty()){
            int size=q.size();
            for(int qi=0;qi<size;qi++){
            int[] cell=q.poll();
            
            for(int[] dir:dirs){
            int x=cell[0]+dir[0];
            int y=cell[1]+dir[1];
                if(x>=0 && x<r && y>=0 && y<c && mat[x][y]==1 && 
                !vis[x][y]){
                    vis[x][y]=true;
                    dp[x][y]=count;
                    q.offer(new int[]{x,y});
                }
            }
            }
            count++;
       }
     return dp;
    }
}