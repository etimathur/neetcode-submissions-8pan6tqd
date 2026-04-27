class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;

        int prev2 = 1; // ways till i-2
        int prev1 = 1; // ways till i-1

        for (int i = 1; i < s.length(); i++) {
            int curr = 0;

            // Single digit
            if (s.charAt(i) != '0') {
                curr += prev1;
            }

            // Two digit
            int num = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (num >= 10 && num <= 26) {
                curr += prev2;
            }

            // If no way possible
            if (curr == 0) return 0;

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}