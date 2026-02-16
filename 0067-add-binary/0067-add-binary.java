class Solution {
public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Start with the carry from the last step
            
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            // Append the digit (0 or 1) to the result
            sb.append(sum % 2); 
            // Calculate new carry (1 if sum is 2 or 3, else 0)
            carry = sum / 2; 
        }

        // Since we added from right to left, we must reverse the result
        return sb.reverse().toString();
    }
}