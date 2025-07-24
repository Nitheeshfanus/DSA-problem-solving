class Solution {
    public int[] sieve(int n) {
        // code here
        if (n < 2) return new int[0];
        boolean[] check=new boolean[n+1];
        
        for(int i=0;i<=n;i++){          
            check[i]=true;
        }
        check[0]=false;
        check[1]=false;
        
        for(int p=2;p*p<=n;p++){
            if(check[p]){
            for(int j=p*p;j<=n;j=j+p){
                check[j]=false;
            }
        }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(check[i]){
                count++;
            }
        }
        int[] ans=new int[count];
        int c=0;
        for(int i=2;i<=n;i++){
            if(check[i]){
                ans[c++]=i;
            }
        }
        return ans;
        
    }
}