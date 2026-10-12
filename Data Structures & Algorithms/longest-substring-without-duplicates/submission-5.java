class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> bum = new HashSet<>();
        int count = 0;
        int maxCount = 0;

        for (int i = 0 ; i < s.length(); i++)
        {
            if (!bum.contains(s.charAt(i)))
            {
                bum.add(s.charAt(i));
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else
            {
                maxCount = Math.max(maxCount, count);
                count = 0;
                bum.clear();
            }
        }
        return maxCount;
    }
}
