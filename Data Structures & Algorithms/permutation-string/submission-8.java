class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> check = new HashMap<>();

        for (char c : s1.toCharArray()) {
            check.put(c, check.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s1.length(); i++) {
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        int l = 0;

        for (int r = s1.length() - 1; r < s2.length(); r++) {
            if (map.equals(check)) {
                return true;
            }
            if (r == s2.length() - 1) {
                break;
            }
            map.put(s2.charAt(r+1), map.getOrDefault(s2.charAt(r+1), 0) + 1);
            if (map.get(s2.charAt(l)) == 1) {
                map.remove(s2.charAt(l));
                l++;
            } else {
                map.put(s2.charAt(l), map.get(s2.charAt(l)) - 1);
                l++;
            }
        }

        return false;
    }
}
