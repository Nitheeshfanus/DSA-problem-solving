class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                if (nums[i] != 0) {
                    result++;
                }
            } else if (nums[stack.peek()] < nums[i]) {
                result++;
            }
            stack.add(i);
        }
        return result;
    }
}