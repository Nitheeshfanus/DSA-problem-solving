class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int r= grid.length;
        int c= grid[0].length;

         
            for(int j=y; j< y+k; j++){
                reverse(grid, x, j, x+k-1);
            }
        return grid;
    }

    void reverse(int[][] grid, int i, int j,int len){
        while(i< len){
        int temp= grid[i][j];
        grid[i][j]= grid[len][j];
        grid[len][j]= temp;
        i++;
        len--;
        }
    }
}