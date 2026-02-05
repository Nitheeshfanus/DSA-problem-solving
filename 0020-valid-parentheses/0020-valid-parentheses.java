class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket
            else {
                // No opening bracket to match
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check mismatch
                if (!iscrct(top, ch)) return false;
            }
        }

        // Stack must be empty at the end
        return stack.isEmpty();
    }

    private boolean iscrct(char l, char r) {
        return (l == '(' && r == ')') ||
               (l == '{' && r == '}') ||
               (l == '[' && r == ']');
    }
}
