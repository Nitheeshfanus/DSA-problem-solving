class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder ss= new StringBuilder(s);
     //   ss.append(s);
        int n= s.length();

        while(n-->0){
            if(ss.toString().equals(goal)) return true;

            ss.append(ss.charAt(0));
            ss.deleteCharAt(0);
        }
       return false;
    }
}