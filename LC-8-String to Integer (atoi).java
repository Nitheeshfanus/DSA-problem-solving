class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int sign=1;
        int i=0;
        int result=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit=s.charAt(i)-'0';

            if(result>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)? Integer.MAX_VALUE : Integer.MIN_VALUE;   //checks for overflow
            }
            result=result*10 + digit;
            i++;
        }
        return result*sign;
    }
}
