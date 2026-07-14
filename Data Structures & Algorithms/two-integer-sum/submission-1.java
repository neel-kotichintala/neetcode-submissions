class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> comp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (comp.containsKey(nums[i])) {
                return new int[] {comp.get(nums[i]), i};
            } else {
                comp.put(target - nums[i], i);
            }
        }

        return new int[] {};
    }
}
