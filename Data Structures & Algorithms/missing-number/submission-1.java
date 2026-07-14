class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_sum = (n*(n+1))/2;
        int sum = 0;
        for (int a : nums) {
            sum += a;
        }

        int diff = actual_sum - sum;
        return diff;
        
    }
}
