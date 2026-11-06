class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap <complement, index>
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            map.put(comp, i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (i < j) {
                    return new int[] {i, j};
                } else {
                    return new int[] {j, i};
                }
            }
        }

        return new int[] {};
    }
}
