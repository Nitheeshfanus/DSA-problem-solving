class Solution {
    public int totalMoney(int n) {
        int[] nums=new int[n+1];
         int mon=1;
         int sum=0;
         
        for(int i=1;i<=n;i++){
             
            if((i-1)%7==0 && i!=1){
                mon+=1;
                nums[i]=mon;
            }
            else if (i == 1) {
                nums[i] = mon;          
            }
            else{
            nums[i]=nums[i-1]+1;
            }
            sum=sum+nums[i];
        }
        return sum;
    }
}