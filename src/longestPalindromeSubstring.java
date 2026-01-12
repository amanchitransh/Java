public class longestPalindromeSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        String lps = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expandAroundCenter(s, i, i);
            if (odd.length() > lps.length()) {
                lps = odd;
            }
            String even = expandAroundCenter(s, i, i + 1);
            if (even.length() > lps.length()) {
                lps = even;
            }
        }
        return lps;
    }
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
    public static void main(String[] args) {
        longestPalindromeSubstring longestSubstr = new longestPalindromeSubstring();
        String sol = longestSubstr.longestPalindrome("ethethethethfffffgggggg");
        System.out.println(sol);
    }
}
