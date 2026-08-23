class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int[] events = new int[1001];

        // Create events
        for (int[] trip : trips) {
            int passengers = trip[0];
            int start = trip[1];
            int end = trip[2];

            events[start] += passengers;
            events[end] -= passengers;
        }

        // Sweep from left to right
        int passengers = 0;

        for (int i = 0; i <= 1000; i++) {

            passengers += events[i];

            if (passengers > capacity) {
                return false;
            }
        }

        return true;
    }
}