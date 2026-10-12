class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        if (s.length() == 0) {
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        int maxLen = 1;
        int curLen = 0;

        int l = 0;
        for (int r = l; r < s.length(); r++) {
            if (set.contains(s.charAt(r))) {
                l = r;
                set.clear();
                curLen = 0;
            } else {
                set.add(s.charAt(r));
                curLen++;
                maxLen = Math.max(maxLen, curLen);
            }
        }

        return maxLen;
    }
}
