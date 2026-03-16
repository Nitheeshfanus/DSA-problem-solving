class Solution {
    public int candy(int[] ratings) {
        int n= ratings.length;
        int[] ans=new int[n];
        Arrays.fill(ans,1);

        for(int i=1; i<n; i++){
            if(ratings[i-1]<ratings[i]){
              ans[i]=ans[i-1]+1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(ratings[i+1] < ratings[i]){
                int temp = ans[i+1]+1;
            //   int temp = ans[i] + ans[i+1] ;
            if(temp > ans[i]){
                 ans[i]=temp;
              }
            }
        }

        int res=0;

        for(int i=0; i<n; i++){
            res+=ans[i];
        }

        return res;
    }
}