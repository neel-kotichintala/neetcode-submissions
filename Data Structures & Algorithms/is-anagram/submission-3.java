class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c_s = s.charAt(i);
            char c_t = t.charAt(i);
            map.put(c_s, map.getOrDefault(c_s, 0) + 1);
            map.put(c_t, map.getOrDefault(c_t, 0) - 1);
        }

        for (Integer val: map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
