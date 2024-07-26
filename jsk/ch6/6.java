class Solution {

    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        for (int windowSize = s.length(); windowSize > 1; windowSize--) {
            for (int i = 0; i <= s.length() - windowSize; i++) {
                if (isPalindrome(s, i, i + windowSize - 1)) {
                    return s.substring(i, i + windowSize);
                }
            }
        }
        return s.substring(0, 1);
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
