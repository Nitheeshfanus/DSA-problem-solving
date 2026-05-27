class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
        int l= 1;
        int r= 0;
        for(int i=0; i<n; i++){
            r= Math.max(r, piles[i]);
        }
        int ans=r;
        while(l <= r){
            int speed = l + (r-l)/2;
            long time= 0;
            for(int i=0; i<n; i++){
                
                time += (piles[i] + speed-1)/speed;
            }
            if(time> h){
                l= speed+1;
            }
            else{
                ans= speed;
                r= speed-1;
            }
        }
    return ans;
    }
}