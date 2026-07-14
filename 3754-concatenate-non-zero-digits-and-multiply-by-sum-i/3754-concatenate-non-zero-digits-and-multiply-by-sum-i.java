class Solution {
    public long sumAndMultiply(int num) {
        
        if(num == 0){
            return 0;
        }

        String s= String.valueOf(num);
        int n= s.length();
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<n; i++){
            char c= s.charAt(i);
            if( c != '0'){
                sb.append(c);
            }
        }

        String a= sb.toString();
        long x= Integer.parseInt(a);

        long sum= 0;
        for(int i=0; i<a.length(); i++){
            sum+= a.charAt(i) -'0';
        }
        return x*sum;
    }
}