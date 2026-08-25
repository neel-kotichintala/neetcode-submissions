class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int m = n / 2;
        int l = 0;
        int r = nums.length - 1;
        
        while (l < r) {
            if (nums[m] == target) {
                return m;
            } else if (target >= nums[m]) {
                l = m + 1;
                m = (r - l) / 2 + l;
            } else {
                r = m - 1;
                m = (r - l) / 2 + l;
            }
        }

        return -1;
    }
}
