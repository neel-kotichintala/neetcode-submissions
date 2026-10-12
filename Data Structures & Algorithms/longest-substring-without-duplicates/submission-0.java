class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> bum = new HashSet<>();
        count = 0;

        for (int i = 0 ; i < s.length(); i++)
        {
            if (!bum.contains(s.charAt(i)))
            {
                bum.put(s.charAt(i))
                count++
            }
            else
            {
                count = 0;
                bum.clear();
            }
        }
        return count;
    }
}
