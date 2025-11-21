class Solution {
    public int countPalindromicSubsequence(String s) {
        int N=s.length();
        int total=0;
        
        for(char ch='a';ch<='z';ch++){
            int left=s.indexOf(ch);
            int right=s.lastIndexOf(ch);

            if(left!=-1 && right!=-1 && right-left>1){
                Set<Character> uniques=new HashSet<>();

                for(int i=left+1;i<right;i++){
                    uniques.add(s.charAt(i));
                }
                total+=uniques.size();
            }
        }
        return total;
    }
}