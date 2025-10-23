class Solution {
    public boolean xorGame(int[] nums) {
        int s=0;
        for(int i:nums){
        s=i^s;
        }
        if(s==0) return true;

        boolean evenlen=(nums.length%2==0);
        if(evenlen){
            return true;
        }
        return false;
    }
}