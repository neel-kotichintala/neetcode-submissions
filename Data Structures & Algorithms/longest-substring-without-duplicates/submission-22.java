class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window
        // start with two pointers at the start l and r
        // 

        HashSet<Character> set = new HashSet<>();
        int max = 0;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while (set.contains(c)) {
                if (s.charAt(l) == c) {
                    set.remove(s.charAt(l));
                    l++;
                    break;
                }
                l++;         
            }
            set.add(s.charAt(r));
            int len = r - l + 1;
            max = Math.max(max, len);
        }

        return max;
    }
}
