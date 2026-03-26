class Solution {
    public int minDeletions(String s) {
        int n= s.length();

        int[] fq= new int[26];
        for(char ch: s.toCharArray()){
            fq[ch - 'a']++;
        }

        int cnt=0;
        HashSet<Integer> hs= new HashSet<>();

        for(int i=0; i< 26; i++){
            int temp= fq[i];
                while(temp> 0 && hs.contains(temp)){
                    temp-=1;
                    cnt++;
                }
                if(temp > 0) hs.add(temp);
        }
        return cnt;
    }
}