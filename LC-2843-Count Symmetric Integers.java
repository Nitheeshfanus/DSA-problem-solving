class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str=Integer.toString(i);
            if(str.length()%2!=0){
                continue;
            }
            int half=str.length()/2;
            int sum1=0,sum2=0;
            for(int j=0;j<half;j++){
                sum1+=str.charAt(j)-'0';
                sum2+=str.charAt(j+half)-'0';
            }
            if(sum1==sum2) count++;

        }
        return count;
    }
}
