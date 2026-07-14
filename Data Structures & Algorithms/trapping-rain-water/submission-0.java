class Solution {
    public int trap(int[] height) {
        int r = height.length - 1;
        int l = 0;
        int rMax = height[r];
        int lMax = height[l];
        int result = 0;

        if (height == null) {
            return 0;
        }

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                result += lMax - height[l];
            }
            else {
                r--;
                rMax = Math.max(rMax, height[r]);
                result += rMax - height[r];
            }
        }
        return result;
    }
}
