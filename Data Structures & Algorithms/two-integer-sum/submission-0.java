class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> differences = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if (differences.containsKey(diff))
            {
                int[] results = new int[2];
                results[0] = differences.get(diff);
                results[1] = i;
                return results;             
            }
            differences.put(nums[i], i);
        }
        return new int[] {};


    }
}
