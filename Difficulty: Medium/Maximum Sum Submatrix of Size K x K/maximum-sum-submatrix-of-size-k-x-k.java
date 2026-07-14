class Solution {
    public int Maximum_Sum(int mat[][], int n, int k) {
        // Your code goes here
        
        int[][] prefix= new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                prefix[i][j]= mat[i][j];
                
                if(i>0)
                prefix[i][j] += prefix[i-1][j];
                
                if(j>0)
                prefix[i][j] += prefix[i][j-1];
                
                if(i>0 && j>0){
                    prefix[i][j] -= prefix[i-1][j-1];
                }
            }
        }
        
        int max= Integer.MIN_VALUE;
        
        for(int i=k-1; i<n; i++){
            for(int j=k-1; j<n; j++){
                
                int sum =prefix[i][j];
                int r1= i-k+1;
                int c1= j-k+1;
                
                if(r1 > 0)
                sum -= prefix[r1-1][j];
                
                if(c1 > 0)
                sum -= prefix[i][c1-1];
                
                if(r1 >0 && c1 >0)
                sum += prefix[r1-1][c1-1];
                
                max= Math.max(sum, max);
            }
        }
        return max;
    }
}
