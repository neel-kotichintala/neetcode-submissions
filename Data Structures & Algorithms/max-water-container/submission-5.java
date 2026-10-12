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

            int area_l = Math.min(heights[l+1], heights[r]) * (r-(l+1));
            int area_r = Math.min(heights[l], heights[r-1]) * ((r-1)-l);
            if (area_l >= area_r) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
