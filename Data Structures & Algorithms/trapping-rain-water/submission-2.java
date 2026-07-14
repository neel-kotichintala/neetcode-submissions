class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length -1 ;

        int total = 0;

        int leftMax = height[0];
        int rightMax = height[r];

        while (l < r) {
            if (height[l] < height[r]) {
                leftMax = Math.max(leftMax, height[l]);
                if (leftMax - height[l] > 0) {
                    total += leftMax-height[l];
                }
                l++;
            } else {
                rightMax = Math.max(rightMax, height[r]);
                if (rightMax - height[r] > 0) {
                    total += rightMax - height[r];
                }
                r--;
            }
        }

        return total;
    }
}
