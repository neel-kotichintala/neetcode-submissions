class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> bum = new HashSet<>();
        int l = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            while (bum.contains(s.charAt(i))) {
                l++;
                bum.remove(s.charAt(i));
            }
            bum.add(s.charAt(i));
            count = i - l + 1;
            max = Math.max(max, count);

        }
        return max;

    }
}
