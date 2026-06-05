class Solution {
    public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] visited=new boolean[R][C];
                    if(dfs(R,C,i,j,board,word,visited,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    int[][] diff=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    private boolean dfs(int R,int C,int i,int j,char[][] board,String word,boolean[][] visited,int wi){
        if(wi==word.length()){
            return true;
        }
        if (i < 0 || i >= R || j < 0 || j >= C || visited[i][j] || board[i][j] != word.charAt(wi)) {
            return false;
        }
         visited[i][j] =true;
        for(int[] dif:diff){ 
        int adjr=i+dif[0];
        int adjc=j+dif[1];
           if(dfs(R,C,adjr,adjc,board,word,visited,wi+1)){ 
            return true;
        }
        }
        visited[i][j]=false;
        return false;
  }
}