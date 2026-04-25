class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l= 0;
        int r= 0;
        int space=0;
        for(char ch: moves.toCharArray()){
            if(ch == 'L'){
                l++;
                r--;
            }
            else if(ch == 'R'){
                r++;
                l--;
            }
            else{
               space++; 
            }
        }
        return Math.max(r,l) + space;
    }
}