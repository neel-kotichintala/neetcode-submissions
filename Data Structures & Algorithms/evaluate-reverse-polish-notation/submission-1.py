class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        res = 0 
        stack = []
        
        for token in tokens: 
            if token == "+":
                first = stack.pop
                second = stack.pop
                res = first + second
                stack.append(res)
            elif token == "-":
                first = stack.pop
                second = stack.pop
                res = second - first
                stack.append(res)
            elif token == "*":
                res = stack.pop * stack.pop
                stack.append(res)
            elif token == "/":
                first = stack.pop
                second = stack.pop
                res = second / first
                stack.append(res)
            else:
                stack.append(token)

        return res

                
