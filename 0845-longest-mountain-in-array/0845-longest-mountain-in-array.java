class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int i = 1;
        int maxLen = 0;

        while (i < n - 1) {
            
            // Check if arr[i] is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                
                int left = i - 1;
                int right = i + 1;

                // Expand left (climb)
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Expand right (descent)
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                maxLen = Math.max(maxLen, right - left + 1);
                
                // Move pointer to end of this mountain
                i = right;
            } else {
                i++;
            }
        }

        return maxLen;
    }
}