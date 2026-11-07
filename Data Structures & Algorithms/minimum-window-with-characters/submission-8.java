class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> tmap = new HashMap<>();

        for (char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        int need = tmap.size();
        int have = 0;

        int min = Integer.MAX_VALUE;
        int[] range = new int[2]; // l, r

        HashMap<Character, Integer> window = new HashMap<>();

        int l = 0;
        int r;
        for (r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (tmap.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).intValue() == tmap.get(c).intValue()) {
                    have++;
                }
            }

            while (have == need) {
                int len = r - l + 1;
                if (len < min) {
                    min = len;
                    range[0] = l;
                    range[1] = r;
                }
                if (tmap.containsKey(s.charAt(l))) {
                    if (window.get(s.charAt(l)).intValue() == tmap.get(s.charAt(l)).intValue()) {
                        have--;
                        window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                        l++;
                    } else {
                        window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                        l++;
                    }
                } else {
                    l++;
                }
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(range[0], range[1] + 1);
    }
}
