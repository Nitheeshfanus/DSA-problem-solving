class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] prefix= new int[n+1];

        for(int[] i: bookings){
            int l= i[0]-1;
            int r= i[1]-1;

            prefix[l] += i[2];
            prefix[r+1] -= i[2];
        }

        int temp=0;
        int[] ans= new int[n];

        for(int i=0; i<n; i++){
            temp += prefix[i];

            ans[i]= temp; 
        }
        return ans;
    }
}