class Solution {
    public long gcdSum(int[] nums) {
         
         int n= nums.length;

         int[] mx= new int[n];
         int[] prefixGcd= new int[n];
        
        int max= nums[0];
         for(int i=1; i<n; i++){
            max= Math.max(max, nums[i]);
            mx[i]= max;
         }

         for(int i=0; i<n; i++){
            prefixGcd[i]= gcd(nums[i], mx[i]);
         }

         Arrays.sort(prefixGcd);

         long sum= 0;
         int l= 0;
         int r= n-1;
         while(l < r){

            sum += gcd(prefixGcd[l], prefixGcd[r]);
            l++;
            r--;
         }
         return sum;
    }
    public int gcd(int a, int b){

        if(b % a == 0){
            return a;
        }
        return gcd(b % a, a);
    }
}