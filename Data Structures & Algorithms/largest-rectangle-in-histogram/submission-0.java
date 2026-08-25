class Solution {
    public int largestRectangleArea(int[] heights) {
        // 0: height, 1: index
        Stack<int[]> stack = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            int height = heights[i];
            while (!stack.isEmpty() && height < stack.peek()[0]) {
                int[] pair = stack.pop();
                maxArea = Math.max(maxArea, pair[0] * (i - pair[1]));
                start = pair[1];
            }
            stack.push(new int[] {height, start});
        }

        int n = heights.length;
        for (int[] pair: stack) {
            maxArea = Math.max(maxArea, pair[0] * (n - pair[1]));
        }

        return maxArea;
    }
}
