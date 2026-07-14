class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() == 0 || s.length() == 1) {
            return false;
        }

        if (s.charAt(0) == ')' ||
            s.charAt(0) == '}' ||
            s.charAt(0) == ']') {
                return false;
            }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() && (s.charAt(i) == ')' ||
            s.charAt(i) == '}' ||
            s.charAt(i) == ']')) {
                    return false;
                } 
                char top = stack.peek();
                if (top == '(' && c == ')' ||
                    top == '{' && c == '}' ||
                    top == '[' && c == ']') {
                        stack.pop();
                    } else {
                        return false;
                    }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
