class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        prefix[0] = 1;
        postfix[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            postfix[i] = nums[i+1] * postfix[i+1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = postfix[i] * prefix[i];
        }

        return result;
    }
}  
