class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i= 0; i<9; i++){
        for(int j=0; j<9; j++){
            if(board[i][j] != '.'){ 
        if(!isValid(board, i, j, board[i][j])){
            return false;
                }
            }
        }
        }
        return true;
    }
    public boolean isValid(char[][] board, int r, int c, char num){

        for(int i=0; i<9; i++){
            if(board[i][c] == num && i != r){
                return false;
            }
        }
        for(int i=0; i<9; i++){
            if(board[r][i] == num && i != c){
                return false;
            }
        }
        int br= (r/3)*3;
        int bc= (c/3)*3;

        for(int i= br; i< br+3; i++){
            for(int j= bc; j< bc+3; j++){
        if(num == board[i][j] && i != r && j != c){
                    return false;
                }
            }
        }
        return true;
    }
}