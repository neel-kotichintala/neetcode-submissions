class Solution {
    public boolean hasDuplicate(int[] nums) {
        int val = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            if (val == nums[i])
            {
                return true;
            }
            else
            {
                val = nums[i];
            }
        }
        return false;
    }
}
