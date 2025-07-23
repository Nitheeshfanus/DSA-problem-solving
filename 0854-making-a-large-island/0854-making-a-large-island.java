class Solution {
    public int largestIsland(int[][] grid) {
        int count=2;
        int R=grid.length;
        int C=grid[0].length;
        int island[]=new int[R*C+2]; 
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1){
                    dfs(grid,count++,R,C,i,j,island); //The current value of count is passed into the dfs function. Only after that, count is incremented.
                }
            }
        }
        int max=0;
        boolean zero=false; //if full matrix is only 1s
        //if there is no zero then return R*C in line 48
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==0){
                    zero=true;
                    int total=1; //counting the zero itself
                    //we will add the size of all the islands which are adjacent to this zero
                    Set<Integer> set=new HashSet<Integer>();// used to counte the island only once while merging 
                    for(int[] dir:direc){
                        int nr=dir[0]+i;
                        int nc=dir[1]+j;
                        if(nr<0||nc<0||nr>=R||nc>=C||grid[nr][nc]<=1){
                            continue;
                        }
                        int nei=grid[nr][nc];
                        if(set.add(grid[nr][nc])){
                            total+=island[nei];
                        }
                    }
                max=Math.max(max,total);
            }
        }
    }
    return zero==true?max:(R*C);
}
    int[][] direc={{1,0},{-1,0},{0,1},{0,-1}};
    private void dfs(int[][] grid,int count,int R,int C,int i,int j,int[] island)
    {
        grid[i][j]=count;
        island[count]++;
        for(int nei[]:direc){
            int nr=nei[0]+i;
            int nc=nei[1]+j;
            if(nr<0||nc<0||nr>=R||nc>=C||grid[nr][nc]!=1){
                continue;
            }
            dfs(grid,count,R,C,nr,nc,island);
        }

    }

}