class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;

        int max = Integer.MIN_VALUE;

        while (l < r) {
            int curr = Math.min(heights[l], heights[r]) * (r - l);
            if (curr > max) {
                max = curr;
            }
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
