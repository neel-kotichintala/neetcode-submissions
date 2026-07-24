class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            int[] freqs = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                freqs[c - 'a']++;
            }

            String key = Arrays.toString(freqs);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
                map.get(key).add(str);
            } else {
                map.get(key).add(str);
            }
        }

        return new ArrayList(map.values());
    }
}
