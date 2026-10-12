class MinStack:

    def __init__(self):
        self.stack = []
        self.minStack = []

    def push(self, val: int) -> None:
        if(len(self.stack) == 0):
            self.stack.append(val)
            self.minStack.append(val)
        else:
            self.stack.push(val)
            if (val < self.minStack.peek()):
                self.minStack.append(val)
            else:
                self.minStack.append(minStack.peek())

    def pop(self) -> None:
        self.stack.pop()
        self.minStack.pop()

    def top(self) -> int:
    
        return self.stack[-1]


    def getMin(self) -> int:
        return self.minStack[-1]
        
