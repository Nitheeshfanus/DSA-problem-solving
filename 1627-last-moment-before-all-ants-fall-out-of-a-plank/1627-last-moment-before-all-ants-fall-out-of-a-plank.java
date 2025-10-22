class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        
        int t=0;
        for(int i=0;i<left.length;i++){
            t=Math.max(t,left[i]);
        }
        for(int j=0;j<right.length;j++){
            t=Math.max(t,n-right[j]);
        }
        return t;
    }
}