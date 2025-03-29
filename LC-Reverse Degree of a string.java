class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int b=1;
        for(char ch:s.toCharArray()){
            int a=26-(ch-'a');
            sum+=a*b;
            b++;
        }
        return sum;
    }
}
