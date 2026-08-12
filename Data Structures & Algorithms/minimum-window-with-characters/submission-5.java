class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int l = 0;
        int length = Integer.MAX_VALUE;
        int ans[] = {-1, -1};

        int need = mapT.size();
        int have = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (mapT.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(mapT.get(c))) {
                    have++;
                }
            } else {
                continue;
            }

            while (l <= r && have == need) {
                int curr_len = r - l + 1;
                if (curr_len < length) {
                    length = curr_len;
                    ans[0] = l;
                    ans[1] = r;
                }

                if (window.containsKey(s.charAt(l))) {
                    window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                    if (window.get(s.charAt(l)) < mapT.get(s.charAt(l))) {
                        have--;
                    }
                }
                l++;
            }
        }
        
        if (length == Integer.MAX_VALUE || ans[0] == -1 || ans[1] == -1) {
            return "";
        }

        return s.substring(ans[0], ans[1] + 1);


    }
}
