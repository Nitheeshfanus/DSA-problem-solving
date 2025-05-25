class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int N=words.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;
        for(int i=0; i<N ;i++){
            int M=words[i].length();
            for(int j=0; j<M ;j++){
                if(words[i].charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
