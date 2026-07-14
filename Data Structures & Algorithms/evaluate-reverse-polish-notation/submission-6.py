class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        res = 0 
        stack = []
        
        if len(tokens) == 1:
            return int(tokens[0])

        for token in tokens: 
            if token == "+":
                res = stack.pop() + stack.pop()
                stack.append(res)
            elif token == "-":
                first = stack.pop()
                second = stack.pop()
                res = second - first
                stack.append(res)
            elif token == "*":
                res = stack.pop() * stack.pop()
                stack.append(res)
            elif token == "/":
                first = stack.pop()
                second = stack.pop()
                res = int(second / first)
                stack.append(res)
            else:
                stack.append(int(token))

        return res

                
