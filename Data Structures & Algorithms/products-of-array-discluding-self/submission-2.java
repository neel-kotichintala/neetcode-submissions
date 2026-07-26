class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;

        int[] result = new int[nums.length];

        result[0] = prefix;

        for (int i = 1; i < nums.length; i++) {
            int pre = nums[i-1] * prefix;
            result[i] = pre;
            prefix = pre;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            int post = nums[i+1] * postfix;
            result[i] = result[i] * post;
            postfix = post;
        }

        return result;
    }
}  
