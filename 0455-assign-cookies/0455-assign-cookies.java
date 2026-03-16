class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ng= g.length;
        int ns= s.length;
        
        Arrays.sort(g);
        Arrays.sort(s);

        int i=0;
        int j=0;
        int ans=0;

        while(i<ng && j<ns){
            if(s[j] >= g[i]){
                ans++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;

    }
}