

class Solution {
    public boolean isValid(String s) {
        Stack<Character> test = new Stack<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == '(' ||
                    arr[i] == '[' ||
                    arr[i] == '{') {
                test.push(arr[i]);
            } else if (arr[i] == ')' ||
                    arr[i] == ']' ||
                    arr[i] == '}') {
                if (test.isEmpty()) {
                    return false;
                }
                char top = test.peek();
                if ((arr[i] == ')' && top == '(') ||
                        (arr[i] == ']' && top == '[') ||
                        (arr[i] == '}' && top == '{')) {
                    test.pop();
                } else {
                    return false;
                }
            }
        }
        return test.isEmpty();
    }
}
