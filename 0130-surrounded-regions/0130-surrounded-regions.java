class Solution {
    public void solve(char[][] board) {
        int R=board.length;
        int C=board[0].length;

        for (int j = 0; j < C; j++) {
            if (board[0][j] == 'O') {
                change(0, j, R, C, board);
            }
            if (board[R - 1][j] == 'O') {
                change(R - 1, j, R, C, board);
            }
        }

        // Left and Right borders
        for (int i = 0; i < R; i++) {
            if (board[i][0] == 'O') {
                change(i, 0, R, C, board);
            }
            if (board[i][C - 1] == 'O') {
                change(i, C - 1, R, C, board);
            }
        }

    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }
            else if(board[i][j]=='w'){
                board[i][j]='O';
            }

        }
    }
    }
    
    int[][] dirs=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    private void change(int i,int j,int R,int C,char[][] board){
        
        if(i<0 ||j<0 || i>=R || j>=C || board[i][j] !='O'){
            return;
        }
        board[i][j]='w';
        for(int[] dir:dirs){
            int adjr=i+dir[0];
            int adjc=j+dir[1];
            change(adjr,adjc,R,C,board);
        }
    }
}