class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        if (s.length() == 0) {
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        int maxLen = 1;
        int curLen = 0;

        int l = 0;
        int r = 0;
        while (r < s.length()) {
            if (set.contains(s.charAt(r))) {
                l = r - 1;
                set.clear();
                curLen = 0;
            } else {
                set.add(s.charAt(r));
                curLen++;
                maxLen = Math.max(curLen, maxLen);
                r++;
            }
        }

        return maxLen;
    }
}
