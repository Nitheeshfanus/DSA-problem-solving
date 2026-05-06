class Solution {
    public List<List<String>> solveNQueens(int n) {

        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        List<List<String>> res=new ArrayList<>();
        placeQueens(0,board,res);
        return res;
    }
private static void placeQueens(int col,char[][] board,List<List<String>> res){
        int n=board.length;

        if(col==n){
            res.add(constructBoard(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';         
                placeQueens(col+1,board,res);//Move to next column (recursive call)
                //Backtrack
            }
            board[row][col]='.';
        }
    }
    private static boolean isSafe(int row, int col,char[][] board){
        int n=board.length;
        int duprow=row;
        int dupcol=col;
        //upper diagonal
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){return false;}
            row--; col--;
        }
        //row
        row=duprow;col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q'){return false;}
            col--;
        }//lower diagonal 
        row=duprow;col=dupcol;
        while(row<n && col>=0){
            if(board[row][col]=='Q'){return false;}
        row++; col--;
        }
        return true;
    }
    private static List<String> constructBoard(char[][] board){
        List<String> boardList=new ArrayList<>();
        for(char[] row:board){
        boardList.add(new String(row));
        }
    return boardList;
    }
}