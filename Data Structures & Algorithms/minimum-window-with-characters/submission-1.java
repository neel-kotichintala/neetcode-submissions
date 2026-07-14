class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1); 
        }

        int l = 0;
        int need = tMap.size();
        int have = 0;
        int minLen = Integer.MAX_VALUE;
        String curMinString = "";
    
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (tMap.containsKey(c)) {
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
                if (sMap.get(c)-1 < tMap.get(c) && sMap.get(c) == tMap.get(c)) {
                    have++;
                    while (need == have) {
                        if (r - l + 1 < minLen) {
                            minLen = r - l + 1;
                            curMinString = s.substring(l, r+1);
                        }
                        if (sMap.containsKey(s.charAt(l))) {
                            sMap.put(s.charAt(l), sMap.get(s.charAt(l)) - 1);
                            if (sMap.get(s.charAt(l)) < tMap.get(s.charAt(l))) {
                                have--;
                            }
                        }
                        l++;
                    }
                }
            }
        }
        return curMinString;
    }
}
