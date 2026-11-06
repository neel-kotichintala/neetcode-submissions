class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // array key
        // array 26 slots - each index 0 - 25 represents a - z
        // each string, we count the freq of each letter in the string
        // hash map <array freq key, array anagrams

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                int index = c - 'a';
                count[index]++;
            }

            String key = Arrays.toString(count);

            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                map.put(key, list);
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
