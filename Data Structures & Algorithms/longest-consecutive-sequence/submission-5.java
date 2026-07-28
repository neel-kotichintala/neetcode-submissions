class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int curr_len = 1;
        int max_len = 1;

        for (int num: nums) {
            while (set.contains(num + 1)) {
                curr_len++;
                num = num + 1;
            }
            if (curr_len > max_len) {
                max_len = curr_len;
            }
            curr_len = 1;
        }

        return max_len;
    }
}
