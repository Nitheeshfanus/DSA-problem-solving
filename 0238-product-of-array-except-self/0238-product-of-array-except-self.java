class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] res=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=nums[i]*left[i-1];
        }
        right[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            right[j]=nums[j]*right[j+1];
        }
        res[0]=right[1];
        res[n-1]=left[n-2];
        for(int k=1;k<n-1;k++){
            res[k]=left[k-1]*right[k+1];
        }

    return res;
    }
}