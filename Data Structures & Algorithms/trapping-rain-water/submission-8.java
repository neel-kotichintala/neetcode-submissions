class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int max_l = height[l];
        int max_r = height[r];

        int count = 0;

        while (l < r) {
            if (max_l < max_r) {
                l++;
                max_l = Math.max(max_l, height[l]);
                count += max_l - height[l];
            } else {
                r--;
                max_r = Math.max(max_r, height[r]);
                count += max_r - height[r];
            }
        }

        return count;
    }
}

