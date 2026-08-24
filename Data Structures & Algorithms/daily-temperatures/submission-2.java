class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // pair[0] = temp, pair[1] = index
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        res[temperatures.length - 1] = 0;
        
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && (temp > stack.peek()[0])) {
                int[] pair = stack.peek();
                int len = i - pair[1];
                res[pair[1]] = len;
                stack.pop();
            }
            int[] new_pair = new int[2];
            new_pair[0] = temp;
            new_pair[1] = i;

            stack.push(new_pair);
        }

        while (!stack.isEmpty()) {
            int[] pair = stack.pop();
            res[pair[1]] = 0;
        }

        return res;
    }
}
