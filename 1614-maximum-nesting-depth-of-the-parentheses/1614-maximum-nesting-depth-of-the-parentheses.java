class Solution {
    public int maxDepth(String s) {
        int n= s.length();
        int depth= 0;
        int ans= 0;  
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);

            if(ch == '('){
                depth++;
            }
            else if(ch == ')'){
                depth--;
            }
            ans= Math.max(ans, depth);
        }
        return ans;
    }
}