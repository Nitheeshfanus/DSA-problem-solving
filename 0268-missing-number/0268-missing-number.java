class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int osum=n*(n+1)/2;
        int xor=0;
        for(int i=0; i<=n ;i++){
            xor ^= i; 
        }
        for(int i=0;i<n;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}