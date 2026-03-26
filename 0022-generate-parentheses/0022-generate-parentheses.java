class Solution {
    List<String> lis= new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        gen("", 0, 0, n);
        return lis;
    }
    void gen(String s,int oc, int cc, int n){
        if(n*2 == s.length()){
            lis.add(s);
            return;
        }
        if(oc < n){
            gen(s+"(", oc+1, cc, n);
        }
        if(cc < oc){
            gen(s+")", oc, cc+1, n);
        }
        
    }
}