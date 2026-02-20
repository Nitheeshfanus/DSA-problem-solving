class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder firstPass = new StringBuilder();
        int balance = 0;

         for (char ch : s.toCharArray()) {

            if (ch == '(') {
                balance++;
                firstPass.append(ch);
            } 
            else if (ch == ')') {
                if (balance > 0) {
                    balance--;
                    firstPass.append(ch);
                }
                // else skip invalid ')'
            } 
            else {
                firstPass.append(ch); // letters always allowed
            }
        }

        // 🥈 Pass 2: Remove extra '(' from right
        StringBuilder result = new StringBuilder();
        
        for (int i = firstPass.length() - 1; i >= 0; i--) {
            char ch = firstPass.charAt(i);

            if (ch == '(' && balance > 0) {
                balance--; // remove this extra '('
            } else {
                result.append(ch);
            }
        }

        return result.reverse().toString();
    }
}