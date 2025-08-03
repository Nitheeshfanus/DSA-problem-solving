class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int N=maze.length;
        int C=maze[0].length;
        int[][]  vis=new int[N][N];
        ArrayList<String> ans=new ArrayList<>();
        if(maze[0][0]==1){ dfs(maze,0,0,N,ans,"",vis);
        }
        return ans;
    }
    
    private final int[][] dirs=new int[][]{{1,0},{0,-1},{0,1},{-1,0}};
    private final char[] dirChars = {'D', 'L', 'R', 'U'};
    
    private void dfs(int[][] maze,int i,int j,int n,ArrayList<String> ans
    , String move, int[][] vis){
        
         
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
     
        for(int c=0;c<4;c++){
            int ar=i+dirs[c][0];
            int ac=j+dirs[c][1];
            
            if(ar>=0 && ac>=0 && ar<n && ac<n && vis[ar][ac]==0 
            &&maze[ar][ac]==1)
            {
                vis[i][j]=1;
                dfs(maze,ar,ac,n,ans,move+ dirChars[c],vis);
                vis[i][j]=0;
            }
        }
    }
}
