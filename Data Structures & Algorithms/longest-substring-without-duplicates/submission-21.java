class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        HashSet<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;

        int max = 0;

        while (r < s.length()) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));
            int count = r - l + 1;
            max = Math.max(max, count);
            r++;
        }
        return max;
    }
}
