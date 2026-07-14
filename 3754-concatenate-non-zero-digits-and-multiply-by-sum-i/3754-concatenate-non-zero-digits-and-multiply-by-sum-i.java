class Solution {
    public long sumAndMultiply(int n) {
        long mul = 1;
        long sum = 0;
        long digit = 0;
        while(n>0){
            int temp = n%10;
            if(temp != 0){
                digit = temp*mul+digit;
                sum+=temp;
                mul*=10;
            }
            n = n/10;
        }
        return sum*digit;
    }
}