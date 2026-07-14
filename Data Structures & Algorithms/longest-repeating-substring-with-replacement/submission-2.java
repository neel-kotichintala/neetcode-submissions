class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;

        int maxLen = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            int maxChar = 0;
            for (Integer price: map.values()) {
                    if (price > maxChar) {
                        maxChar = price;
                    }
                }
            while ((r-l+1) - maxChar > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            maxLen = Math.max(r-l+1, maxLen);
            r++;
        }

        return maxLen;


    }
}
