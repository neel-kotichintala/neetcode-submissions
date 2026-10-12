class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> counts1 = new HashMap<>();
        HashMap<Character, Integer> counts2 = new HashMap<>();

        for (char c: s1.toCharArray()) {
            counts1.put(c, counts1.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = 0;

        while (r < s2.length()) {
            char c = s2.charAt(r);
            while (!counts1.containsKey(c)) {
                l++;
                r=l;
                break;
            }
            counts2.put(c, counts2.getOrDefault(c, 0) + 1);
            if (counts1.equals(counts2)) {
                return true;
            }
            r++;
        }

        return false;
    }
}
