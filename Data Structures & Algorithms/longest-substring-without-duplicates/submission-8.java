class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> bum = new HashSet<>();
        int l = 0;
        int max = 0;
        int count = 0;

        for (int r = 0; r < s.length(); r++) {
            while (bum.contains(s.charAt(r))) {
                bum.remove(s.charAt(l));
                l++;
            }
            bum.add(s.charAt(r));
            max = Math.max(max, r-l +1);

        }
        return max;

    }
}
