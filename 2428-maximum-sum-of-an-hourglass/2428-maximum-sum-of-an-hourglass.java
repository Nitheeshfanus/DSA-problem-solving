class Solution {
    public int maxSum(int[][] grid) {

        int row= grid.length;
        int col= grid[0].length;
        int sum=0;
        int ans=0;

        for(int i=1; i< row-1; i++){
            for(int j=1; j< col-1; j++){

                sum= grid[i][j] + grid[i-1][j]+ grid[i+1][j]
                    + grid[i-1][j-1] + grid[i-1][j+1] +
                    + grid[i+1][j+1]+ grid[i+1][j-1];

                ans= Math.max(ans, sum);
            }
        }
        return ans;
    }
}