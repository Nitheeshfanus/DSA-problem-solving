class Solution {
    public boolean asteroidsDestroyed(int mass, int[] as) {
        long m= mass;
        int n= as.length;
        Arrays.sort(as);

        for(int i=0; i<n; i++){
            if(m >= as[i]){
                m+=as[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}