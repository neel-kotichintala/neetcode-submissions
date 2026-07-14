class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> check = new HashMap<>();

        for (int i = 0; i < strs.length; i++)
        {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String a = new String(charArray);
            if (check.containsKey(a))
            {
                check.get(a).add(strs[i]);
            }
            else
            {
                check.put(a, new ArrayList<>());
                check.get(a).add(strs[i]);
            }
        }

        return new ArrayList<>(check.values());
    }
}
