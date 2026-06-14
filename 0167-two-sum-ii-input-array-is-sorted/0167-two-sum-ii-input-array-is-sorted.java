class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;

        int l= 1;
        int r= n-1;
        int right= -1;
        for(int i=0; i<n; i++){

        right= bsearch(nums, nums[i], i+1, r, target);

          if( right != -1){
            return new int[]{i+1, right+1};
          }
        }
        return new int[]{-1,-1};
    }

    int bsearch(int[] nums, int a, int l, int r, int t){
            while(l <= r){
                int m= l + (r-l)/2;
                int c= nums[m] + a;
                if(c == t){
                    return m;
                }
                else if(c > t){
                    r= m-1;
                }
                else{
                    l= m+1;
                }
            }
            return -1;
        }   
}