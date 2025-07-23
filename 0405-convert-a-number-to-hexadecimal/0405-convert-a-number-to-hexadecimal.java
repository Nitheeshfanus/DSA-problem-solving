class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        long n=num<0 ? (long)num + (1L<<32) : num;
        return rec(n);
    }

    private String rec(long n){

        if(n==0) return "";

        String hexString="0123456789abcdef";
        char digit=hexString.charAt((int)(n%16));
        return rec(n/16)+digit;
    }
}