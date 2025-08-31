class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r=image.length;
        int c=image[0].length;
        int source=image[sr][sc];
        
         if (source == color) return image;

        dfs(image,sr,sc,r,c,source,color);
        return image;
    }
    private static int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

    private void dfs(int[][] image,int i,int j,int r,int c,int source,int color){

        if(i<0 || j<0 || i>=r || j>=c || image[i][j]!=source){
            return;
        }
        image[i][j]=color;
        for(int[] dir:dirs){
            int ar=dir[0]+i;
            int ac=dir[1]+j;
                 dfs(image,ar,ac,r,c,source,color);
        }
     }
}