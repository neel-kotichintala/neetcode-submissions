class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int maxLeft = 0;
        int maxRight = height[r];

        int total = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                maxLeft = Math.max(height[l], maxLeft);
                if (maxLeft - height[l] > 0) {
                    total += maxLeft - height[l];
                }
                l++;
            } else {
                maxRight = Math.max(height[r], maxRight);
                if (maxRight - height[r] > 0) {
                    total += maxRight - height[r];
                }
                r--;
            }
        }

        return total;
    }
}
