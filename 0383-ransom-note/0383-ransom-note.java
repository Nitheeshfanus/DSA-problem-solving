class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n1= ransomNote.length();
        int n2= magazine.length();

        int[] f= new int[26];

        for(char c: magazine.toCharArray()){
            f[c - 'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            f[c - 'a']--;
            if(f[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}