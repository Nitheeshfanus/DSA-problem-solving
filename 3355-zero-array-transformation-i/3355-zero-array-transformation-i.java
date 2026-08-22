class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

            int n= nums.length;
            int qn= queries.length;
            int[] prefix= new int[n+1];

            for(int i=0; i< qn; i++){
                int l= queries[i][0];
                int r= queries[i][1];

                prefix[l] += 1;
                prefix[r+1] += -1;
            }

            int available =0;
            for(int i=0 ;i< n; i++){
                available += prefix[i];

                if(available < nums[i]){
                    return false;
                }

            }
            return true;
    }
}