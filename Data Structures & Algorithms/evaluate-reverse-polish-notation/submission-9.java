class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        int res = 0;

        for (String token : tokens) {
            if (token.equals("+")) {
                res = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                stack.push(Integer.toString(res));
            } else if (token.equals("-")) {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                res = second - first;
                stack.push(Integer.toString(res));
            } else if (token.equals("/")) {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                res = second / first;
                stack.push(Integer.toString(res));
            } else if (token.equals("*")) {
                res = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
                stack.push(Integer.toString(res));
            } else {
                stack.push(token);
            }
        }
        return res;
        
    }
}
