import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, max = 0;
        HashSet<Character> hashSet = new HashSet<>();

        while (right < s.length()) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                right++;
                max = Math.max(max, hashSet.size());
            } else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int sol = solution.lengthOfLongestSubstring("ahfyebsganauetqbsjs");
        System.out.println(sol);
    }
}
