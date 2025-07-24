class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int n = x.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        // Store max y for each unique x
        for (int i = 0; i < n; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i], Integer.MIN_VALUE), y[i]));
        }

        if (map.size() < 3) return -1;

        // Collect all max y values and sort descending
        List<Integer> values = new ArrayList<>(map.values());
        values.sort(Collections.reverseOrder());

        return values.get(0) + values.get(1) + values.get(2);
    
    }
}