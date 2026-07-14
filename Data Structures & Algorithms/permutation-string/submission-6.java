class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Sliding window (iterate through s2 with window of length s1.length)
        // keep track of counts of characters with array (use character mapping with  - 'a')

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            for (int r = 0; r < 26; r++) {
                if (count1[r] == count2[r]) {
                    matches++;
                }
            }
            if (matches == 26) {
                return true;
            } else {
                matches = 0;
            }

            count2[s2.charAt(i + s1.length()) - 'a']++;
            count2[s2.charAt(i) - 'a']--;
        }

        for (int r = 0; r < 26; r++) {
            if (count1[r] == count2[r]) {
                matches++;
            }
        }
        if (matches == 26) {
            return true;
        } else {
            return false;
        }
    }
}
