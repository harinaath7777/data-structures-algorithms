class Solution {
        public String largestOddNumber(String num) {
            // Start from the end of the string
            for (int i = num.length() - 1; i >= 0; i--) {
                char ch = num.charAt(i);
                int digit = ch - '0'; // Convert character to integer

                // Check if digit is odd
                if (digit % 2 == 1) {
                    return num.substring(0, i + 1);
                }
            }
            // No odd digit found
            return "";
    }
}

