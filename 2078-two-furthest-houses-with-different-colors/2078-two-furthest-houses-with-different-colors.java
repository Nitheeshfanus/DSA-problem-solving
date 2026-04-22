class Solution {
    int i;
    public int maxDistance(int[] colors) {
        int len=0;
        int n = colors.length;
        
        for( i=0; i< n; i++){
           if(colors[n-1] != colors[i]){
            len= Math.max(len, (n-1)-i);
           }
        }
        for(int i=n-1; i>= 0; i--){
            if(colors[0] != colors[i]){
                len= Math.max(i, len);
            }
        }
        return len;
    }
}