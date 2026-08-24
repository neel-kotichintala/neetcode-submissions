class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        Stack<Character> stack = new Stack();

        for (char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if (map.get(c) == top) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        if (stack.size() == 0) { 
            return true;
        }

        return false;

    }
}
