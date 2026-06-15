class Solution {
    public int findLongestChain(int[][] arr) {
         int n= arr.length;
        Arrays.sort(arr,(a,b) -> (a[1]-b[1]));

        int skip=0;
        int end= arr[0][1];
        for(int i=1; i<n; i++){
            if(end < arr[i][0]){
                end= arr[i][1];
                skip++;
            }
        }
        return skip+1;
    }
}