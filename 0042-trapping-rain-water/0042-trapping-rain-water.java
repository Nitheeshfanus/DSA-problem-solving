class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxwater=0;
        int[] lmaxarr=new int[n];
        int[] rmaxarr=new int[n];
        lmaxarr[0]=height[0];
        for(int i=1;i<n;i++){
            lmaxarr[i] = Math.max(lmaxarr[i - 1], height[i]);
        }
        rmaxarr[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
             rmaxarr[j] = Math.max(rmaxarr[j + 1], height[j]);
        }
        
        for(int i=0;i<n;i++){
        int maxlevel=Math.min(lmaxarr[i],rmaxarr[i]);
        maxwater+=maxlevel-height[i];
        }
        return maxwater;
        
    }
}