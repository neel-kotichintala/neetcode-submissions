class Solution {
    public int search(int[] nums, int target) {
        // use binary search first pass to find the pivot
        // pivot is the start of the second sorted part of the array
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;

            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;
        r = nums.length - 1;

        if (target <= nums[r]) {
            l = pivot;
        } else {
            l = 0;
            r = pivot - 1;
        }

        while (l < r) {
            int m = (l + r) / 2;

            if (nums[m] == target) {
                return m;
            } else if (target > nums[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;

    }
}
