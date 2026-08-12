class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int max_l = height[l];
        int max_r = height[r];

        int count = 0;

        while (l < r) {
            if (height[l] > max_l) {
                max_l = height[l];
            }
            if (height[r] > max_r) {
                max_r = height[r];
            }

            int min_max = Math.min(max_l, max_r);
            // left side
            if (height[l] < max_l && height[l] < max_r) {
                count += min_max - height[l];
            }

            if (height[r] < max_l && height[r] < max_r) {
                count += min_max - height[r];
            }

            if (max_l >= max_r) {
                r--;
            } else {
                l++;
            }
        }

        return count;
    }
}

