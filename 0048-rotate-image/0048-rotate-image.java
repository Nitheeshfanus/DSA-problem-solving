class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        for(int i=0;i<n;i++){
            int start=0,end=n-1;
            while(start<end){
                int temp = matrix[end][i];
                matrix[end][i]=matrix[start][i];
                matrix[start][i]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
           
            }
              
                }
        
    
    
