class Solution {
    public int[][] merge(int[][] intervals) {
          if(intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= current[1]) {
                // Overlapping, merge
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap, add current to result
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current); // add last interval

        return result.toArray(new int[result.size()][]);
    
    }
}