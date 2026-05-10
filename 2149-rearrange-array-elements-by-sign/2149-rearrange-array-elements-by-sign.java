class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int nn= n/2;
        int[] neg= new int[nn];
        int[] pos= new int[nn];
        int l=0, r=0;

       for(int i=0;i< n ;i++)
       {
        if(nums[i]<0)
        {
            neg[l++]= nums[i];
        }
        else
        {
            pos[r++]= nums[i];
        }
       }
       boolean flag= true;
       l=0;
       r=0;
       for(int i=0; i<n; i++)
       {
        if(flag)
        {
            nums[i]= pos[l++];
            flag= false;
        }
        else
        {
           nums[i]= neg[r++]; 
           flag= true;
        }
       }
    return nums;
    }
}