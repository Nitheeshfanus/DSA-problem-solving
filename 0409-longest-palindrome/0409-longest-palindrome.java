class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int[] count=new int[128];
        for(char ch:s.toCharArray()){
            count[ch]++;
        }
        int len=0;
        boolean odd=false;
        for(int freq:count){
            if(freq%2==0){
                len=len+freq;
            }
            else{
                len+=(freq-1);
                odd=true;
            }
        }
        return odd?len+1:len;
    }
}