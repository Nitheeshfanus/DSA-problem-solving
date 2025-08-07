class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=  new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char right=s.charAt(i);
            if(!stack.isEmpty()){
                char left=stack.peek();
                if(iscrct(left,right)){
                    stack.pop();
                    continue;
                }
            }
            
            stack.push(right);
            
        }
        return stack.isEmpty();
    }
    private boolean iscrct(char l,char r){
        return (l=='{' && r=='}' || 
           l=='[' && r==']' ||
           l=='(' && r==')');
    }
}