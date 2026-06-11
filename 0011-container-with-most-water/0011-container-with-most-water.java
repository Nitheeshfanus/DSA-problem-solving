class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,ans=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            int water=min*(j-i);
             if(water>ans){
                ans=water;
             }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return ans;
    }
}