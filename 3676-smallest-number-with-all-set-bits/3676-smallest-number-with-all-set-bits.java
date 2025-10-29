class Solution {
    public int smallestNumber(int n) {
        int N= Integer.SIZE - Integer.numberOfLeadingZeros(n);
        int ans=(1<<N)-1;
        return ans;
    }
}