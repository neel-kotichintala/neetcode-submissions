class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        int count = 0;
        for (int l = 0; l < s2.length() - s1.length(); l++) {
            for (int i = 0; i < 26; i++) {
                if (count1[i] == count2[i]) {
                    count++;
                }
            }
            if (count == 26) {
                return true;
            } else {
                count = 0;
            }

            count2[s2.charAt(l + s1.length()) - 'a']++;
            count2[s2.charAt(l) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count1[i] == count2[i]) {
                count++;
            }
        }
        if (count == 26) {
            return true;
        }
        return false;
    }
}
