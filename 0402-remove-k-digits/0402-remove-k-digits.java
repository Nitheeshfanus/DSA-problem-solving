class Solution {
    public String removeKdigits(String num, int k) {

        int n= num.length();

        if(n==k){
            return "0";
        }

        StringBuilder sb= new StringBuilder();
         
        for(char ch: num.toCharArray()){

 while(k> 0 && sb.length()> 0 && sb.charAt(sb.length()-1) > ch){
      sb.deleteCharAt(sb.length()-1);
      k--;
}
          sb.append(ch);
        }

        while(sb.length()> 0 && k> 0){
            sb.deleteCharAt(sb.length()-1);
            k--;
        }

        int i=0;
        while(i< sb.length() && sb.charAt(i) == '0'){
            i++;
        }
        String result = sb.substring(i);

        return result.length() == 0 ? "0" : result;
    }
}